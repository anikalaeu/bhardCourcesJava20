package by.belhard.j20.homeworks.homework1;

public class Exercise2 {

    public static void main(String[] args) {

        /* 2) Создать переменную r целого типа. Присвоить ей какое-то значение. r – радиус окружности.
        Вывести на экран площадь круга и длину окружности.
        Усложним, перед тем, как вычислять радиус и площадь, проверьте, что r – положительно.
        Если так – то вычисляем, если нет – выведем на консоль сообщение о невалидности входных данных.     */


        int r;
        r = 20;
        float lenght, sqare;
        double pi = 3.1415;


        if (r > 0) {
            lenght = (float) (2 * pi * r);
            sqare = (float) (pi * r * r);
            System.out.println(lenght);
            System.out.println(sqare);
        } else System.out.println("Radius must be bigger then zero");


    }
}
