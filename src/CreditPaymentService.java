public class CreditPaymentService {
    public double calculate (int sum, double intRate, int timeMonths) {
        double payment = (sum * intRate + sum ) / timeMonths;
        int wholePayment = (int) payment;
        return wholePayment;
    }
}