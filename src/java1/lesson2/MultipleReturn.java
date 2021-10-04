package java1.lesson2;

public class MultipleReturn {

    public static void main(String[] args) {
        Pair result = test(1, 2, 3);
        System.out.println(result.value1);
        System.out.println(result.value2);
    }

    private static Pair test(int a, int b, int c) {
        int res1 = a + b;
        int res2 = a + c;

        return new Pair(res1, res2);
//        return res1, res2;
    }

    private static class Pair {
        int value1;
        int value2;

        public Pair(int value1, int value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
    }
}
