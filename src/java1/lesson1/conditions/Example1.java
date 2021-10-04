package java1.lesson1.conditions;

public class Example1 {

    public static void main(String[] args) {
        int currentTemperature = 45;
        // Если в переменной currentTemperature лежит число больше 35, 
        // то напечатаем сообщение про жару. В противном случае - про холод.
        // В нашем случае 20 <= 35, поэтому в консоль отпечатается холод

        if (currentTemperature > 35) {
            System.out.println("Ох как жарко");
        } else {
            System.out.println("Что-то прохладно сегодня на улице");
        }

        System.out.println("Finish");
    }

}
