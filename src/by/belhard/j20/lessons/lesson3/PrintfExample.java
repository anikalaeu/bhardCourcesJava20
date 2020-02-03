package by.belhard.j20.lessons.lesson3;



public class PrintfExample {

    public static void main(String[] args) {

        String name = "AlexAlexAlexAlexAlex";

        System.out.printf("I'm %d years old. My name is %s.", 32, name);
        System.out.println();
        System.out.printf("I'm %d years old. My name is %10.10s.", 32, name);


        System.out.println();


        //New Example

        /* n=5 вывод в виде треугольника

              1
              22
              333
              4444
              55555
                    1
                   2 2
                  3 3 3
                 4 4 4 4
                5 5 5 5 5
              Ввиде равностороннего треугольника

         */

        int n = 9;
        int qap = n -1;
        String result;

        for (int i = 1; i <= n; i++) {
            result = "";
            for (int q = 0; q < qap; q++) {
                result += " ";
            }

            for (int j = 0; j < i; j++) {
                result += i + " ";
            }
            System.out.println(result);
            qap--;


        }






    }
}
