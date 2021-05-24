package by.jonline.module4.task8;

public class CustomerView {

    public void showByCardNumberEnter (CustomerArray array,String one, String two) {
        for (int i = 0; i < array.getSize(); i++) {
            if (array.getCustomers()[i].getCard_number().compareTo(one) >= 0 && array.getCustomers()[i].getCard_number().compareTo(two) < 0) {
                System.out.println(array.getCustomers()[i].toString());
            }
        }
    }

    private void print (Customer customer) {
        System.out.println(customer.toString());
    }

    public void showAll (CustomerArray array) {
        for (Customer customers: array.getCustomers()) {
            print(customers);
        }
    }
}
