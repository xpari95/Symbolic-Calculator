public class allFunctions {

    public double allFunctionsr(char c, double a, double b) {
        double result = 0.0;
        if (c == '+') {
            Addition add = new Addition();
            result = add.Addition(a, b);
        }
        if (c == '-') {
            Subtraction sub = new Subtraction();
            result = sub.Subtraction(a, b);
        }
        if (c == '*') {
            Multiplication multi = new Multiplication();
            result = multi.Multiplication(a, b);
        }
        if (c == '/') {
            Division div = new Division();
            result = div.Division(a, b);
        }
        return result;
    }

    public int getPriority(char c) {
        if (c == '+') {
            return 1;
        }
        if (c == '-') {
            return 1;
        }
        if (c == '*') {
            return 2;
        }
        if (c == '/') {
            return 2;
        }
        return 0;
    }
}