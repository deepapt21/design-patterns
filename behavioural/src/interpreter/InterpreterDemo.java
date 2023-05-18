package interpreter;

public class InterpreterDemo {

    static Expression buildInterpreterTree() {
        Expression terminalExpression1 = new TerminalExpression("Lions");
        Expression terminalExpression2 = new TerminalExpression("Tigers");
        Expression terminalExpression3 = new TerminalExpression("Bears");

        Expression alternation1 = new AndExpression(terminalExpression2, terminalExpression3); // Tigers and Bears

        Expression alternation2 = new OrExpression(terminalExpression1, alternation1); // Lions or (Tigers and Bears)

        return new AndExpression(terminalExpression3, alternation2); // Bears and (Lions or (Tigers and Bears))
    }

    public static void main(String[] args) {
        Expression expression = buildInterpreterTree();
        // String context = "Lions and Bears"; // True
        String context = "Tigers and Bears";
        // String context = "Lions and Tigers"; // False
        System.out.println(context + " is " + expression.interpret(context));
    }
}
