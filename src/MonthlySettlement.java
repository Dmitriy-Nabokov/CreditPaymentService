public class MonthlySettlement {
    public double calculate1(int CreditSumm, int AmountOfMonths, double interestRate) {

        double result1;
        double auxiliaryVariable1 = (interestRate / 12) * 0.01;
        double auxiliaryVariable2 = 1 + auxiliaryVariable1;
        double auxiliaryVariable3 = Math.pow(auxiliaryVariable2,AmountOfMonths);
        double koeff = (auxiliaryVariable1 * auxiliaryVariable3) / (auxiliaryVariable3 - 1);
        result1 = CreditSumm * koeff;

        return result1;
    }
    public double calculate2(int CreditSumm, int AmountOfMonths, double interestRate) {

        double result2;
        double auxiliaryVariable1 = (interestRate / 12) * 0.01;
        double auxiliaryVariable2 = 1 + auxiliaryVariable1;
        double auxiliaryVariable3 = Math.pow(auxiliaryVariable2,AmountOfMonths);
        double koeff = (auxiliaryVariable1 * auxiliaryVariable3) / (auxiliaryVariable3 - 1);
        result2 = CreditSumm * koeff;

        return result2;
    }
    public double calculate3(int CreditSumm, int AmountOfMonths, double interestRate) {

        double result3;
        double auxiliaryVariable1 = (interestRate / 12) * 0.01;
        double auxiliaryVariable2 = 1 + auxiliaryVariable1;
        double auxiliaryVariable3 = Math.pow(auxiliaryVariable2,AmountOfMonths);
        double koeff = (auxiliaryVariable1 * auxiliaryVariable3) / (auxiliaryVariable3 - 1);
        result3 = CreditSumm * koeff;

        return result3;
    }
}
