package by.belhard.j20.homeworks.homework1;

public class Exercise6 {

    public static void main(String[] args) {

        /*
        6) Банк предлагает вклад под процент.
        Дано: начальная сумма вклада startSum, процент годовых proc, количество лет years,
        на которые совершается вклад. Сумма индексируется каждый год
        (это значит, что после каждого года процент начисляется не на изначальную сумму, а на текущую).
        Вывести, сколько денег будет на счету после years лет.
        *доп. Каждый год банк вычитает из суммы вклада налог в размере 1% от изначального вклада.

         */


        var startSum = 50000;
        float proc = 8.0f;
        var years = 5;
        var tax = 1;
        var sumTax = startSum * tax / 100;
        float procInd = 1 + proc / 100;

        System.out.println("Комиссия банка = " + sumTax);
        System.out.println("Процентный индекс = " + procInd);


        float res = startSum;
        while (years > 0) {

            res = res * procInd - sumTax;
            System.out.println(res);
            years--;
        }
        System.out.println("ИТОГО " + res);
    }
}
