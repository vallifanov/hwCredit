public class CreditPaymentService {
    public int calculate(int credit, int years, double percent) {
        double i = percent / 12 / 100;
        int n = years * 12;
        double a = 1.0 + i;
        Math.pow(a, n);
        double x = Math.pow(a, n);
        double k = (i * x) / (x - 1);
        double s = k * credit;
        return (int) s;
    }
}
