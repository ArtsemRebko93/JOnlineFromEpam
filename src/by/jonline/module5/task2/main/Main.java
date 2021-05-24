package by.jonline.module5.task2.main;

import by.jonline.module5.task2.entity.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addOrder("Coffe",34.6);
        payment.addOrder("Mac",3300);
        payment.addOrder("Apple",0.6);

        System.out.println(payment.toString());
        payment.deleteOrder("Coffe");
        System.out.println(payment.toString());
    }
}
