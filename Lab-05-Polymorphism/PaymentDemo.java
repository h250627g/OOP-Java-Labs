interface Payment {
    void process();
}

class CardPayment implements Payment {

    @Override
    public void process() {
        System.out.println("Processing card payment");
    }
}

class MobileMoneyPayment implements Payment {

    @Override
    public void process() {
        System.out.println("Processing mobile money payment");
    }
}

class PaymentProcessor {

    public void pay(Payment p) {
        if (p instanceof CardPayment card) {
            card.process();
        } else if (p instanceof MobileMoneyPayment mobile) {
            mobile.process();
        }
    }

    //  Using polymorphism
    public void payPolymorphically(Payment p) {
        p.process();
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        System.out.println("Using instanceof:");
        processor.pay(new CardPayment());
        processor.pay(new MobileMoneyPayment());

        System.out.println("\nUsing polymorphism:");
        processor.payPolymorphically(new CardPayment());
        processor.payPolymorphically(new MobileMoneyPayment());
    }
}
