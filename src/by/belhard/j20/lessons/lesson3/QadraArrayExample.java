package by.belhard.j20.lessons.lesson3;

public class QadraArrayExample {

    public static void main(String[] args) {

        int[][] arr2 = new int[3][];
        arr2[0] = new int[3];
        arr2[1] = new int[] {1, 3} ;
        arr2[2] = new int[1];

        byte[][] arrayByte = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arrayByte[1][2]);


        int [][] multiTable = new int[8][8];

        for (int i = 2; i<=9; i++) {
            for (int j = 2; j <= 9; j++) {
                multiTable[i - 2][j - 2] = i * j;
            }
        }
        for (int [] innerArray : multiTable) {
            for (int i : innerArray) {
                System.out.print(i + " ");
        }
            System.out.println(); }
        System.out.println();
        System.out.println();


        for(int i = 0; i < multiTable.length; i++) {
            for (int j = 0; j < multiTable.length; j++) {
                System.out.print(multiTable[i][j] + " ");
            }
            System.out.println();
        }

        String[] strArr = {"arr", "kfjq","gal", "djf", "hg", "jf", "-", "q", "kgjwweropq", ""};
        String result = "";

        for (String s : strArr) {
            if (s.length() <= 3)
                result += s + "|";
        }
        System.out.println(result);


    }
}
