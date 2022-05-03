import java.util.Objects;
import java.util.Stack;

public class ArithmeticExpressions implements ArithExpr {

    String expression;

    public ArithmeticExpressions(String xprs) {
        expression = xprs;
    }

    public static String[] tokenize(String xprs) {
        String substring = "";
        int previousOpIdx = -1;
        Stack<String> tokens = new Stack<String>();

        for (int j = 0; j < xprs.length(); j++) {
            char k = xprs.charAt(j);


            if (k == '+' || k == '/' || k == '*' || k == '-' || k == '(' || k == ')') {
                substring = xprs.substring(previousOpIdx + 1, j);

                if (!substring.equals("")) {
                    tokens.push(substring);
                }
                tokens.push(Character.toString(k));
                previousOpIdx = j;
            }

        }
        substring = xprs.substring(previousOpIdx + 1);
        if (!substring.equals("")) {
            tokens.push(substring);
        }

        return tokens.toArray(new String[0]);
    }

    @Override
    public double eval() throws NumberFormatException {
        String xprs = expression;
        String[] tokens2 = ArithmeticExpressions.tokenize(xprs);
        Stack<Double> nums = new Stack<Double>();
        Stack<Character> opers = new Stack<Character>();
        Double[] numsTemp = new Double[tokens2.length];
        char operTemp = ' ';
        double valueTemp1 = 0.0;
        double valueTemp2 = 0.0;
        double result = 0;
        allFunctions together = new allFunctions();

        for (int i = 0; i < tokens2.length; i++) {
            if (Objects.equals(tokens2[i], " ")) {
                break;

            }
            if (tokens2[i].charAt(0) >= '0' && tokens2[i].charAt(0) <= '9') {
                numsTemp[i] = Double.parseDouble(tokens2[i]);
                nums.push(numsTemp[i]);
            } else if (tokens2[i].charAt(0) == '(') {
                operTemp = tokens2[i].charAt(0);
                opers.push(operTemp);
            } else if (tokens2[i].charAt(0) == ')') {
                while (opers.peek() != '(') {
                    operTemp = opers.pop();
                    valueTemp1 = nums.pop();
                    valueTemp2 = nums.pop();
                    allFunctions together2 = new allFunctions();
                    result = together2.allFunctionsr(operTemp, valueTemp2, valueTemp1);
                    nums.push(result);
                }
            }
            char thisOp = tokens2[i].charAt(0);
            if (thisOp == '+' || thisOp == '-' || thisOp == '*' || thisOp == '/') {
                while (!opers.empty() && nums.size() >= 2 && together.getPriority(thisOp) <= together.getPriority(opers.peek())) {
                    operTemp = opers.pop();
                    valueTemp1 = nums.pop();
                    valueTemp2 = nums.pop();
                    allFunctions together2 = new allFunctions();
                    result = together2.allFunctionsr(operTemp, valueTemp2, valueTemp1);
                    nums.push(result);
                }
                opers.push(thisOp);
            }


        }

        while (!opers.empty() && nums.size() >= 2) {
            if (opers.peek() == '(') {
                opers.pop();
            }
            operTemp = opers.pop();
            valueTemp1 = nums.pop();
            valueTemp2 = nums.pop();
            allFunctions together2 = new allFunctions();
            result = together2.allFunctionsr(operTemp, valueTemp2, valueTemp1);
            nums.push(result);
        }


        return nums.peek();
    }

    public String toString() {
        double resultA = eval();
        String resultB = resultA + " ";
        return resultB;
    }
}
