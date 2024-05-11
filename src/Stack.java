public class Stack extends AbstractStack {
    public Stack(int capacity) {
        super(capacity);
    }

    // method untuk menampilkan stack
    public void displayStack(String s) {
        System.out.println(s); // menapilkan string yang diberikan pada parameter
        System.out.println("stack (bottom ->): ");

        // looping melalui setiap elemen dalam stack
        for (int i = 0; i < size(); i++) {
            System.out.println(peek(i) + " "); // menampilkan elemen pada index ke-i
        }
    }

    // method untuk mendapatkan elemen pada index ke-n
    public int peek(int n) {
        return arr[n]; // mengembalikan elemen pada index ke-n
    }
}
