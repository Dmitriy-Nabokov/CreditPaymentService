public class MonthlySettlement {
    public double calculate(int CreditSumm, int AmountOfMonths, double interestRate) {

        double result;
        double x = (interestRate / 12) * 0.01;
        double y = 1 + x;
        double z = Math.pow(y, AmountOfMonths);
        double koeff = (x * z) / (z - 1);
        result = CreditSumm * koeff;

        return result;
    }
}
