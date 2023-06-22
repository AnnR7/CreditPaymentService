public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double yearInterestPercents = 9.99;
        int creditPeriod = 12;
        int payment = service.calculate (amount, yearInterestPercents, creditPeriod);
        System.out.println("Ежемесячный платеж " + (payment));
    }
}
