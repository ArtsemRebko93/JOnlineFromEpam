package by.jonline.module4.task8;

import java.util.Arrays;

public class CustomerArray {

    private Customer [] customers;
    private int capacity;
    private int size;
    public CustomerArray () {
        this(10);
    }
    public CustomerArray(int capacity) {
        this.capacity = capacity;
        customers = new Customer[capacity];
    }

    public void addCustomer (Customer customer) {
        if (size < capacity) {
            customers[size] = customer;
            size++;
        } else  {
           Customer [] capacityBuffer = new Customer[capacity * 2];
            for (int i = 0; i < size; i++) {
                capacityBuffer[i] = customers[i];
            }
            customers = capacityBuffer;
            capacity = capacityBuffer.length;
            customers[size] = customer;
            size++;
        }
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public int getSize() {
        return size;
    }
}
