package by.belhard.j20.lessons.lesson02;

public class SecondMain {

    public static void main(String[] args) {

        byte b1;
        b1 = 127;
        byte b2 = 2;
        //byte b3 = b1 + b2; not possible!!!
        byte b3 = (byte) (b1 + b2); //Значение гоняет от -128 до 127 по кругу

        long l1 = 2500000000L; //в конце нужно ставить L, т.к. считает что int
        float f1 = 2.5f;
        int i1 = 25;
        var i2 = 35;
        char ch1 = 99;
        char ch2 = 'A';
        String s1 = "Hallo!";

//        System.out.println(b3);
//        System.out.print(ch1);
//        System.out.println((int)ch2);
//        System.out.println(s1);
//        System.out.println((char)('a' + 2));

//        int a = 1;
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(15 / 7.0);
        System.out.println(15 / 0.0);
        System.out.println(15 != 15);
        boolean b = 15 == 15;
        System.out.println(b);


    }
}
