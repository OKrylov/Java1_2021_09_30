package java1.lesson2;

public class Methods {

    public static void main(String[] args) {
        greetingWorld();
        greetingAlexey();

        greeting("Oleg");
        greeting("Russia");


//        sumAB(2, 2);
//        printSum(2, 3);
//
//        int result = sumAB(5, 15);
        System.out.println(sumAB(5, 15)); // 20
    }

    private static void printSum(int a, int b) {
        int sumResult = sumAB(a, b); // 5
        System.out.println(sumResult);
    }

    private static int sumAB(int a, int b) {
        int result = a + b;
        if (result > 0) {
            return result;
        }

        System.out.println(result);
        return 0;
    }

    public static void greetingWorld() {
        System.out.println("Hello, world");
    }

    private static void greetingAlexey() {
        System.out.println("Hello, Alexey!");
    }

    private static void greeting(String name) {
        System.out.println("Hello, " + name);
    }


}
