public class Third {
    public static void main (String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж при сроке 1 год равен ");
        System.out.println(service.calculate(1_000_000,0.999, 12));

        System.out.println();
        System.out.println("Ежемесячный платеж при сроке 2 года равен ");
        System.out.println(service.calculate(1_000_000,0.999, 24));

        System.out.println();
        System.out.println("Ежемесячный платеж при сроке 3 года равен ");
        System.out.println(service.calculate(1_000_000,0.999, 36));

    }
}