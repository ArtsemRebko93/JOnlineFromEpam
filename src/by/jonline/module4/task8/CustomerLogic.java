package by.jonline.module4.task8;

import java.util.Arrays;

public class CustomerLogic {

    public void sortByName (CustomerArray customerArray) {
        Arrays.sort(customerArray.getCustomers(), 0, customerArray.getSize(), new Customer.NameComparator());
    }


}
