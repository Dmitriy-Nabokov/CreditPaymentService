public class Main {
    public static void main(String[] args) {

        MonthlySettlement service = new MonthlySettlement();

        int CreditSum = 1_000_000;   //Сумма кредита

        int months1 = 12;       //Количество месяцев
        int months2 = 24;       //Количество месяцев
        int months3 = 36;       //Количество месяцев

        double rate = 9.99;     //Процентная ставка

        double payment1 = service.calculate1(CreditSum, months1, rate);
        double payment2 = service.calculate2(CreditSum, months2, rate);
        double payment3 = service.calculate3(CreditSum, months3, rate);

        System.out.println();
        System.out.println("Сумма кредита: " + CreditSum + " Руб");

        System.out.printf("Процентная ставка: " + rate + "%%");
        System.out.println();
        System.out.println();

        System.out.printf("Ежемесячный платеж на 12 месяцев составит: ");
        System.out.printf("%.2f",payment1);
        System.out.println(" Руб");

        System.out.printf("Ежемесячный платеж на 24 месяца составит : ");
        System.out.printf("%.2f",payment2);
        System.out.println(" Руб");

        System.out.printf("Ежемесячный платеж на 36 месяцев составит: ");
        System.out.printf("%.2f",payment3);
        System.out.println(" Руб");
    }
}