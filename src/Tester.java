public class Tester {
    public static void main(String[] args) {
        ArrayStack<String> p1 = new ArrayStack<String>(3);
        p1.push("A");
        p1.push("B");
        p1.push("C");
        p1.push("D");
        p1.display();
    }
}
