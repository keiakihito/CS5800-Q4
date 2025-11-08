package payment.gateway;

import payment.PaymentGateway;

public class SquareGateway implements PaymentGateway {
    private final double _paymentAmount;
    private final String _locationId;

    public SquareGateway(double paymentAmount, String locationId) {
        _paymentAmount = paymentAmount;
        _locationId = locationId;
    }

    @Override
    public void processPayment() {
        System.out.println("Square processed $" + _paymentAmount + " at location " + _locationId);
    }
}
