public class CreditPaymentService {
    public double calculate(int sum, double intRate, int timeMonths) {
        double payment = (sum * intRate / 12) * Math.pow((1 + intRate / 12), timeMonths) / (Math.pow((1 + intRate / 12), timeMonths) - 1);
        int wholePayment = (int) payment;
        return wholePayment;
    }
}