package by.belhard.j20.lessons.lesson3;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array = new int[5]; //преподу больше такой нравится:) 5 - размерность массива, номерация идет c 0
        System.out.println(array[0]);

        /*int array1 [];
        int array2 [][]; //двумерный массив*/

        array[0]=1;
        array[2]=34;
        array[3]=576;
        array[4]=200;

        for (int i =0; i < array.length; i++){
            array[i] = i * 2;
            System.out.println(array[i]);
        }
        System.out.println(array.length); //выведет длинну массива 5
        /* Внимание!!! помнить про размерность массива!!! компилятор не ивсегда показывает нарушение размерности при обращении*/

        System.out.println(array); //Выводит хэш-код объекта [I@58ceff1


        String[] stringArray = new String[]{"One", "Two", "Three", "Four", "Five", "Six"};


        //For-Each
        for (String s : stringArray) {
            if (s.equals("Three")) //строки сравниваются так
                continue; // это пропуск хода
            System.out.println(s);
        }






    }
}
