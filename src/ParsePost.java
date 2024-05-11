public class ParsePost {
    private final String input;
    private Stack stack;

    public ParsePost(String input) {
        this.input = input;
    }

    public int doParse() {
        stack = new Stack(20);
        char ch;
        int i;
        int num1, num2, interAns;

        for (i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            stack.displayStack("" + ch + " ");

            if (ch >= '0' && ch <= '9') {
                System.out.println("number");
                stack.push((int) (ch - '0'));
            } else {
                num2 = stack.pop();
                num1 = stack.pop();
                interAns = switch (ch) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num1 / num2;
                    default -> 0;
                };
                stack.push(interAns);
            }
        }

        interAns = stack.pop();
        return interAns;
    }
}
