package by.belhard.j20.homeworks.homework1;

public class Exercise5 {

    public static void main(String[] args) {

        /*
        5) Даны 2 числа, a – целое, n – целое положительное.
        Используя цикл, найти результат возведения a в степень n.

         */
        int a = 2;
        int b = 1;
        int n = 5;


        for (int i = n ; i > 0; i--) {
            b *= a;

        }
        System.out.println(b);
    }
}
