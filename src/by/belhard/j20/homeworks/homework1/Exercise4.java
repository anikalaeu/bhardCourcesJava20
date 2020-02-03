package by.belhard.j20.homeworks.homework1;

public class Exercise4 {

    public static void main(String[] args) {

        /*
        4) Даны зарплаты трех людей salary1, salary2 и salary3.
        Найти разницу между максимальной и минимальной зарплатой.
         */
        int sal1 = 112;
        int sal2 = 117;
        int sal3 = 115;
        int max; //int max = s1;
        int min; //int min = s1; минус одна проверка


        /* if (sal2 > max)
            max = sal2;

            max = Math.max(Math.max(sal1, sal2), sal3); //нужны разные значения sal1...sal3
         */


        if (sal1 > sal2)
            max = sal1;
        else max = sal2;

        if (max > sal3) ;
        else max = sal3;

        if (sal1 < sal2)
            min = sal1;
        else min = sal2;
        if (min < sal3) ;
        else min = sal3;

        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);

        System.out.println("Difference between Maximun and Minimum is " + (max - min));


    }


}
