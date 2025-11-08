package payment.gateway;

import payment.PaymentGateway;

public class PayPalGateway implements PaymentGateway {
    private final double _paymentAmount;
    private final String _userEmail;

    public PayPalGateway(double paymentAmount, String userEmail) {
        _paymentAmount = paymentAmount;
        _userEmail = userEmail;
    }

    @Override
    public void processPayment() {
        System.out.println("PayPal processed $" + _paymentAmount + " for " + _userEmail);
    }
}
