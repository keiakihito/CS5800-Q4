package payment.client;

import payment.PaymentGateway;
import payment.gateway.PayPalGateway;
import payment.gateway.SquareGateway;
import payment.gateway.StripeGateway;

public class PaymentProcessor {
    public static void main(String[] args) {
        System.out.println("=== Part 1: PayPal and Stripe ===");
        PaymentGateway[] part1Gateways = new PaymentGateway[] {
                new PayPalGateway(29.99, "student@cpp.edu"),
                new StripeGateway(49.99, "Lisa Cardholder", "4242 4242 4242 4242", "10/29")
        };
        runDemo(part1Gateways);

        System.out.println("\n=== Part 2: Add Square ===");
        PaymentGateway[] part2Gateways = new PaymentGateway[] {
                new PayPalGateway(12.50, "akira@cpp.edu"),
                new StripeGateway(75.00, "Ken Masters", "5555 6666 7777 8888", "03/30"),
                new SquareGateway(15.00, "pomona-campus-kiosk")
        };
        runDemo(part2Gateways);
    }

    private static void runDemo(PaymentGateway[] gateways) {
        for (PaymentGateway gateway : gateways) {
            gateway.processPayment();
        }
    }
}
