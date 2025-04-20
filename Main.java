public class Main {
    public static void main(String[] args) {
        div();
        check();
    }

    public static void div() {
        System.out.println("this is division method");
        int result = 3 / 0; // This will throw ArithmeticException
    }

    public static String check() {
        return "h";
    }
}
