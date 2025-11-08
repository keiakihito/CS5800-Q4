package payment.gateway;

import payment.PaymentGateway;

public class StripeGateway implements PaymentGateway {
    private final double _paymentAmount;
    private final String _cardholderName;
    private final String _cardNumber;
    private final String _expirationDate;

    public StripeGateway(double paymentAmount, String cardholderName, String cardNumber, String expirationDate) {
        _paymentAmount = paymentAmount;
        _cardholderName = cardholderName;
        _cardNumber = cardNumber;
        _expirationDate = expirationDate;
    }

    @Override
    public void processPayment() {
        System.out.println("Stripe processed $" + _paymentAmount + " for " + _cardholderName + " card " + _cardNumber
                + " exp " + _expirationDate);
    }
}
