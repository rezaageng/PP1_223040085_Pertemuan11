public class Stack extends AbstractStack {
    public Stack(int capacity) {
        super(capacity);
    }

    public void displayStack(String s) {
        System.out.println(s);
        System.out.println("stack (bottom ->): ");

        for (int i = 0; i < size(); i++) {
            System.out.println(peek(i) + " ");
        }
    }

    public int peek(int n) {
        return arr[n];
    }
}
