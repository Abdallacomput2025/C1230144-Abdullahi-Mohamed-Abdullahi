package OnePackage;

public class Tester {
    public static void main(String[] args) {
        ArrayStack<String> s1 = new ArrayStack<String>(3);
        s1.push("10");
        s1.push("20");
        s1.push("30");
        s1.push("40");
        s1.display();
    }
}
