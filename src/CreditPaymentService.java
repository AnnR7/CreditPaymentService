public class CreditPaymentService {
    public int calculate (int amount, double yearInterestPercents, int creditPeriod) {
        double monthRate = yearInterestPercents / 12 / 100;
        double result1 = 1 + monthRate;
        double result2 = Math.pow(result1, creditPeriod);
        double payment = amount * monthRate * (result2 / (result2 - 1));
        return (int) payment;
    }
}
