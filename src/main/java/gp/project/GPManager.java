package gp.project;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class GPManager {
    // CONST
    final int
            POP_SIZE = 25000,
            GENERATIONS = 100,
            RANDOM_COUNT = 102,
            T_SIZE = 2,
            MAX_DEPTH = 4;
    public final double
            CROSSOVER_PROB = 0.9,
            EPSILON = -1e-5;

    // VAR
    static Random rd = new Random();

    List<Tree> population;
    double[] fitness;
    int minRandom, maxRandom;
    int varNumber, fitnessCases, randomNumber;
    long seed;
    double[][] targets;

    public GPManager(String fileName, long s ) {
        population = new ArrayList<>();
        fitness =  new double[POP_SIZE];

        seed = s;
        if (this.seed >= 0L) {
            rd.setSeed(this.seed);
            Tree.setSeed(this.seed);
        }

        setup(fileName);
        for (int i = 0; i < RANDOM_COUNT; i++ )
            Tree.addRandomNumber(this.minRandom, this.maxRandom);

        createRandomPopulation(fitness);
    }

    void setup(String fileName) {
        try {
            BufferedReader in =  new BufferedReader(new FileReader(fileName));
            String line = in.readLine();
            StringTokenizer tokens = new StringTokenizer(line);

            varNumber = Integer.parseInt(tokens.nextToken().trim());
            randomNumber = Integer.parseInt(tokens.nextToken().trim());
            minRandom =	Integer.parseInt(tokens.nextToken().trim());
            maxRandom =  Integer.parseInt(tokens.nextToken().trim());
            fitnessCases = Integer.parseInt(tokens.nextToken().trim());

            if (varNumber + randomNumber >= RANDOM_COUNT)
                System.out.println("too many variables and constants");

            targets = new double[fitnessCases][varNumber + 1];

            for (int i = 0; i < fitnessCases; i ++) {
                line = in.readLine();
                tokens = new StringTokenizer(line);
                for (int j = 0; j <= varNumber; j++)
                    targets[i][j] = Double.parseDouble(tokens.nextToken().trim());
            }

            in.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("ERROR: Please provide a data file");
            System.exit(0);
        }
        catch(Exception e) {
            System.out.println("ERROR: Incorrect data format");
            System.exit(0);
        }
    }

    void createRandomPopulation(double[] fitness) {
        var serial = new Serialize("new_file.txt");
        for (int i = 0; i < POP_SIZE; i++) {
            Tree tree = this.createRandomTree(serial);
            this.population.add(tree);
            fitness[i] = this.fitnessFunction(this.runForAllInputs(tree));
        }
    }

    Tree createRandomTree(Serialize serializer) {
        Tree tree = new Tree();
        tree.grow(MAX_DEPTH);
        tree.root.serialize(serializer);
        return tree;
    }

    List<Double> runForAllInputs(Tree tree) {
        List<Double> input = new ArrayList<>();
        List<Double> outputs = new ArrayList<>();

        for (int i = 0; i < fitnessCases; i ++) {
            // TODO for now including target value, to be changed in the future
            for (int j = 0; j <= varNumber; j++)
                input.add(targets[i][j]);

            outputs.add(tree.run(input));
            input.clear();
        }

        return outputs;
    }

    double fitnessFunction(List<Double> outputs) {
        double fit = 0.0;

        for (int i = 0; i < outputs.size(); i++)
            fit += Math.abs(outputs.get(i) - targets[i][varNumber]);

        return -fit;
    }

    void evolve() {
        for (int gen = 1; gen < GENERATIONS; gen++) {
            double bestFitness = getBestFitness();
            if (bestFitness > EPSILON) {
                System.out.print("PROBLEM SOLVED\n");
                System.exit(0);
            }

            for (int i = 0; i < POP_SIZE; i++) {
                Tree newTree;

                if (rd.nextDouble() < CROSSOVER_PROB) {
                    int parent1 = tournament();
                    int parent2 = tournament();
                    newTree = crossover(population.get(parent1), population.get(parent2));
                }
                else {
                    int parent = tournament();
                    newTree = mutation(population.get(parent));
                }

                double newFit = fitnessFunction(runForAllInputs(newTree));
                int offspring = negativeTournament(fitness);
                population.set(offspring, newTree);
                fitness[offspring] = newFit;
            }
        }

        System.out.print("PROBLEM *NOT* SOLVED\n");
        System.exit(1);
    }

    double getBestFitness() {
        double bestFitness = fitness[rd.nextInt(POP_SIZE)];
        int best = 0;

        for (int i = 0; i < POP_SIZE; i++)
            if (fitness[i] > bestFitness) {
                bestFitness = fitness[i];
                best = i;
            }

        population.get(best).print();
        return bestFitness;
    }

    int tournament() {
        int best = rd.nextInt(POP_SIZE), competitor;
        double fitnessBest = -1.0e34;

        for (int i = 0; i < T_SIZE; i++) {
            competitor = rd.nextInt(POP_SIZE);
            if (fitness[competitor] > fitnessBest) {
                fitnessBest = fitness[competitor];
                best = competitor;
            }
        }
        return best;
    }

    int negativeTournament(double[] fitness) {
        int worst = rd.nextInt(POP_SIZE), competitor;
        double fitnessWorst = 1e34;

        for (int i = 0; i < T_SIZE; i++) {
            competitor = rd.nextInt(POP_SIZE);
            if (fitness[competitor] < fitnessWorst) {
                fitnessWorst = fitness[competitor];
                worst = competitor;
            }
        }

        return worst;
    }

    Tree crossover(Tree parent1, Tree parent2) {
        Tree offspring = parent1.copy();
        offspring.crossover(parent2);
        return offspring;
    }

    Tree mutation(Tree parent) {
        Tree offspring = parent.copy();
        offspring.mutate();
        return offspring;
    }
}