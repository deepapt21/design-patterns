package interpreter;

public class OrExpression implements Expression {

    private final Expression exp1;
    private final Expression exp2;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public boolean interpret(String context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
