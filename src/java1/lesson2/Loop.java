package java1.lesson2;

public class Loop {

    public static void main(String[] args) {
//        testForLoop();
        System.out.println(pow(2, 3));


//        // 2^3 == 2 * 2 * 2 = 8
        int a = 2;
        int result = a * a * a;
        System.out.println(result);
//
//        // 2^5 == 2 * 2 * 2 * 2 * 2 = 32
//
        result = a * a * a * a * a;
        System.out.println(result);

        int i = 0;
        for (;;) {
            System.out.println("Bye!");
            i++;
            if (!(i < 5)) {
                break;
            }
        }

        for (int j = 0, k = 2; j < 5 && k < 7; j++, ++k) {
            if (j % 2 != 0) {
                continue;
            }

            System.out.println(j);
        }

        int foo = 1;
//        int bar = ++foo;
        int bar = foo++;
        System.out.println("Bar: " + bar);

    }

    private static void testForLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Hello!");
        }
    }

    private static int pow(int a, int b) {
        int result = 1; // 2 * 2 * 2 * 2 = 2^4 = 16
        for (int i = 0; i < b; i++) {
            result *= a;  // result = result * a;
        }
//        System.out.println(i);

        return result;
    }
}
