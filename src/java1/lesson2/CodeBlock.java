package java1.lesson2;

public class CodeBlock {

    public static void main(String[] args) {
        int a = 3;
        test(a);
//        test(3);
//        a = test2(a);
        System.out.println(a);

        if (a < 5) {
            int b = 5;
            System.out.println(1);
            System.out.println("str");
        }
//        System.out.println(b);


        {
            int b = 5;
            System.out.println(b);
        }

        switch (a) {
            case 1: {
                int test = 7;
                System.out.println(test);
                break;
            }
            case 2: {
                int test = 8;
                System.out.println(test);
                break;
            }
        }


    }

    private static void test(int a) {
        a = 4;
//        a.field1 = 2;
    }

    private static int test2(int a) {
        a = 4;
        return a;
    }
}
