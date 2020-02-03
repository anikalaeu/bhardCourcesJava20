package by.belhard.j20.lessons.lesson3;

public class Lesson3Main {

    public static void main(String[] args) {

        int i = 8;
        String result = "";


        switch (i) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;

            default:
                System.out.println("no input");
                break;


        }

        System.out.println(result);


    }
}
