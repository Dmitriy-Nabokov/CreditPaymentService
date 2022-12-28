public class Main {
    public static void main(String[] args) {

        MonthlySettlement service = new MonthlySettlement();

        int CreditSum = 1_000_000;   //Сумма кредита

        int months = 12;       //Количество месяцев

        double rate = 9.99;     //Процентная ставка

        double payment = service.calculate(CreditSum, months, rate);

        System.out.println();
        System.out.println("Сумма кредита: " + CreditSum + " Руб");

        System.out.printf("Процентная ставка: " + rate + "%%");
        System.out.println();
        System.out.println();

        System.out.printf("Ежемесячный платеж на 12 месяцев составит: ");
        System.out.printf("%.2f", payment);
        System.out.println(" Руб");
    }
}