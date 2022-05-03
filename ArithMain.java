import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArithMain {
    public static void main(String[] args) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File("C:\\Users\\trick\\Documents\\arithmetics.txt"));
        String answer = " ";
        while (true) {
            try {
                answer = input.nextLine();

            } catch (NoSuchElementException exception) {
                return;
            }

            for (int k = 0; k < answer.length(); k++) {
                char answerC = answer.charAt(k);
                if (isItNumOrOp.NumOrOp(answerC)) {
                    System.out.println("Some of the characters in the text are not permitted");
                    break;
                }
            }
            ArithmeticExpressions result = new ArithmeticExpressions(answer);
            try {
                System.out.println(result.toString());
            } catch (NumberFormatException exception2) {
                return;
            }
        }

    }
}

