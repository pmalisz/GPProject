package gp.project.enums;

public enum NodeType {
    PROGRAM("program"),
    IN("in"),
    OUT("out"),
    IF("if"),
    WHILE("while"),
    PLUS("+"),
    MINUS("-"),
    TIMES("*"),
    DIV("/"),
    ASSIGN("="),
    GREATER(">"),
    LESS("<"),
    AND("&&"),
    OR("||"),
    NOT("!"),
    EQUAL("=="),
    NOT_EQUAL("!="),
    ID("id"),
    INT("int");

    String name;

    NodeType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
