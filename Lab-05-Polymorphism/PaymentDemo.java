interface Payment {
}

class CardPayment implements Payment {

    public void process() {
        System.out.println("Processing card payment");
    }
}

class MobileMoneyPayment implements Payment {

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

    public void payPolymorphically(Payment p) {
        if (p instanceof CardPayment card) {
            card.process();
        } else if (p instanceof MobileMoneyPayment mobile) {
            mobile.process();
        }
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        processor.pay(new CardPayment());
        processor.pay(new MobileMoneyPayment());
    }
}
