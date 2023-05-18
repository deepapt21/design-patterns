package interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        StringTokenizer tokenizer = new StringTokenizer(context);
        while (tokenizer.hasMoreTokens()) {
            if (tokenizer.nextToken().equals(data)) {
                return true;
            }
        }

        return false;
    }
}
