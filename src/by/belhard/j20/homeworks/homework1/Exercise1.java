package by.belhard.j20.homeworks.homework1;

public class Exercise1 {

    /*1) Создать по одной переменной каждого примитивного типа, присвоить им значения.
    Попробовать совершить какие-либо действия над ними (арифметические, логические, сравнения).
    Вывести на экран результаты этих действий.
    Например:
    int i = 158;
    System.out.println(i* 30 % 24); // должно вывести 12
    System.out.println(i>= 100); // должно вывести true*/


    public static void main(String[] args) {
        byte b1 = 1;
        char c1 = 99;
        short s1 = 2;
        int i1 = 345;
        long l1 = 255555555L;
        double d1 = 2.54;
        float f1 = 2.58f;
        boolean bo1 = true;
        byte b2 = (byte) (s1 * b1);


        System.out.println(c1);
        System.out.println(2 * b1);
        System.out.println(b2);
        System.out.println(i1 < 100);
        System.out.println(bo1 != false);
        System.out.println((float) (d1 * f1));
        System.out.println(l1 / i1);
        System.out.println(l1 % i1);


    }
}
