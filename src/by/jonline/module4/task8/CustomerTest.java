package by.jonline.module4.task8;

import java.util.Scanner;

public class CustomerTest {
    public static void main(String[] args) {
        CustomerArray array = new CustomerArray();
        Scanner scanner = new Scanner(System.in);
        array.addCustomer(Customer.getCostumer(scanner));
        System.out.println("NEXT");
        array.addCustomer(Customer.getCostumer(scanner));
        CustomerLogic logic = new CustomerLogic();
        logic.sortByName(array);
        CustomerView view = new CustomerView();
        view.showAll(array);

    }
}
