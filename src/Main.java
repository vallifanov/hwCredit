public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int resultOneYear = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж составит: " + resultOneYear);
        int resultTwoYears = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж составит: " + resultTwoYears);
        int resultThreeYears = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж составит: " + resultThreeYears);
    }
}
