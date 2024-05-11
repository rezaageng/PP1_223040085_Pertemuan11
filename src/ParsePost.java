public class ParsePost {
    private final String input;
    private Stack stack;

    public ParsePost(String input) {
        this.input = input;
    }

    // method untuk melakukan parsing
    public int doParse() {
        stack = new Stack(20);
        char ch;
        int i;
        int num1, num2, interAns;

        // looping melalui setiap karakter dalam input
        for (i = 0; i < input.length(); i++) {
            ch = input.charAt(i); // mengambil karakter pada index ke-i
            stack.displayStack(ch + " "); // menampilkan stack

            // jika karakter adalah angka
            if (ch >= '0' && ch <= '9') {
                stack.push((int) (ch - '0')); // push angka ke stack
            } else {
                num2 = stack.pop(); // mengambil dan menghapus elemen teratas dari stack, disimpan ke num2
                num1 = stack.pop(); // mengambil dan menghapus elemen teratas dari stack, disimpan ke num1
                // melakukan operasi sesuai dengan karakter
                interAns = switch (ch) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num1 / num2;
                    default -> 0;
                };
                stack.push(interAns); // push hasil operasi ke stack
            }
        }

        interAns = stack.pop(); // mengambil dan menghapus elemen teratas dari stack, disimpan ke interAns
        return interAns; // mengembalikan interAns sebagai hasil
    }
}
