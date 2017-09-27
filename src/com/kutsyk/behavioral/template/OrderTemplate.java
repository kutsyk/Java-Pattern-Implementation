package com.kutsyk.behavioral.template;

public abstract class OrderTemplate {

    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doDelivery();

    public final void buy() {
        doCheckout();
        doPayment();
        doDelivery();
    }

}
