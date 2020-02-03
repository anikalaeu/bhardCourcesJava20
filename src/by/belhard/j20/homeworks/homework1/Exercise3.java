package by.belhard.j20.homeworks.homework1;

public class Exercise3 {

    public static void main(String[] args) {


        /*
        3) Дана температура в градусах. Вывести на экран , что лучше надеть: куртку, свитер, майку или ничего.
        Например,при температуре менее 10 – куртку, от 10 до 15 – ветровку, от 16 до 20 свитер,
        от 21 до 30 майку, выше 30 – ничего.
         */

        int temp = 18;
        String result;

        if (temp >= 30)
            System.out.println("На улице тепло, одевайся как хочешь");
        else if (temp >= 21 && temp < 30) {
            //result = "На улице тепло, одевайся как хочешь";
            System.out.println("Хоть маечку надень");
        } else if (temp >= 16 && temp <= 20) { //(temp <=20);

            System.out.println("Я тебе свитер связала, а ты его не носишь");
        } else if (temp >= 10 && temp < 16) {
            System.out.println("Надень ветровочку");
        } else {
            System.out.println("Куртку надень!!! А лучше сиди дома - нечего тебе там делать!");
            //System.out.println(result);

        }

    }


}
