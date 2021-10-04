package java1.lesson1.firstapp;

public class FirstAppMath {

    public static void main(String[] args) {
        int a = 5;
        a = a - 2;
        System.out.println(a);

        int a1 = testMathOperations();

        int b = a1 + 5; // b = 15
        System.out.println(b);

        testOtherOperations();

        printSum(2, 5);
        printSum(97, 3);
    }

    private static void testOtherOperations() {
        int c = 16;
        float d = 5.0f;
        System.out.println(c / d);
        System.out.println(c % d);

        float k = (2 + 2) * 2;
        System.out.println(k);

        double z = (20.0 / 100);
        System.out.println(z * 100 + "%");

        double y = 10 / 3.0;
        System.out.println(y);
        System.out.printf("%.2f%n", y);
    }

    private static int testMathOperations() {
        int a1 = 10; // a = 10
        System.out.println(a1);

        a1++; // увеличить значение переменной a на 1, получим a = 11
        System.out.println(a1);

        a1--; // уменьшить значение переменной a на 1, получим a = 10
        System.out.println(a1);

        //        a = a + 10;
        a1 += 10; // увеличить значение переменной a на 10, получим a = 20
        System.out.println(a1);

        //        a = a * 2;
        a1 *= 2; // умножить значение переменной a на 2, получим a = 40
        System.out.println(a1);

        a1 /= 4; // поделить значение переменной a на 2, получим a = 10
        System.out.println(a1);
        return a1;
    }

    public static int printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

        return sum;
    }

    public static void testCommonMath() {
        int a = testMathOperations();

        int b = a + 5; // b = 15
        System.out.println(b);

        int c = 16;
        float d = 5.0f;
        System.out.println(c / d);
        System.out.println(c % d);
    }
}
