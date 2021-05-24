package by.jonline.module5.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {

    private List<Order> list;

    public Payment () {
        list = new ArrayList<>();
    }

    public void addOrder(String nameOfProduct, double price) {
        list.add(new Order(nameOfProduct,price));
    }

    public void deleteOrder (String nameOfProduct) {
        int index = 0;
        for (Order order: list) {
            if (order.getNameOfProduct().equalsIgnoreCase(nameOfProduct)) {
                index = list.indexOf(order);
            }
        }
        list.remove(index);
    }

    public double getCurrentPaymentAmount () {
        double sum = 0;
        for (Order order: list) {
            sum += order.getPrice();
        }
        return sum;
    }

    public List<Order> getList() {
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(list, payment.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentList=" + list + ", currentPaymentAmout=" + getCurrentPaymentAmount() +
                '}';
    }

    public static class Order {
        private String nameOfProduct;
        private double price;

        public Order(String nameOfProduct, double price) {
            this.nameOfProduct = nameOfProduct;
            this.price = price;
        }

        public String getNameOfProduct() {
            return nameOfProduct;
        }


        public double getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Order order = (Order) o;
            return price == order.price &&
                    Objects.equals(nameOfProduct, order.nameOfProduct);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nameOfProduct, price);
        }

        @Override
        public String toString() {
            return "Order{" +
                    "nameOfProduct='" + nameOfProduct + '\'' +
                    ", price=" + price +
                    '}';
        }

    }

}
