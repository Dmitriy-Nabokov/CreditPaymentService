public class MonthlySettlement {
    public double calculate1(int a, int b, double c) {

        double result1;
        double s = (c / 12) * 0.01;
        double n = 1 + s;
        double z = Math.pow(n,b);
        double k = (s * z) / (z - 1);
        result1 = a * k;

        return result1;
    }
    public double calculate2(int a, int b, double c) {

        double result2;
        double s = (c / 12) * 0.01;
        double n = 1 + s;
        double z = Math.pow(n,b);
        double k = (s * z) / (z - 1);
        result2 = a * k;

        return result2;
    }
    public double calculate3(int a, int b, double c) {

        double result3;
        double s = (c / 12) * 0.01;
        double n = 1 + s;
        double z = Math.pow(n,b);
        double k = (s * z) / (z - 1);
        result3 = a * k;

        return result3;
    }
}
