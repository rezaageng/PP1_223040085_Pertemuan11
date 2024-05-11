import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String input;
        int output;

        while (true) {
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = getString();
            if (input.isEmpty()) {
                break;
            }

            ParsePost parsePost = new ParsePost(input);
            output = parsePost.doParse();
            System.out.println("Result " + output);
        }
    }

    public static String getString() throws IOException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
