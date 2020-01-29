package by.belhard.j20.lessons.lesson02;

public class ConstructionsExamples {


    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        if (a >= 5) {
            System.out.println("a is greater than 5");
            a++;
        } else if (a >= 0) {
            System.out.println("ahahaha");
        } else {
            System.out.println("oh no!!!");
        }
        //    System.out.println("a less then 5");

        System.out.println("a = " + a);

        int q = 5;
        int v = 80;
        double e = 3.5;

        System.out.println("True " + (q + v + e) + " Ahaha");


        for (var i = 50; i > 0; i-=10) {
            System.out.print(i + " ");
            b = i;
        }
        System.out.println("\n\n" + b);
    }
}
