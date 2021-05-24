package by.jonline.module4.task8;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

/* Создать класс Customer, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

 */
public class Customer  {
    private int id;
    private static int ID = 1;
    private String surname;
    private String name;
    private String patronymic; //отчество
    private String card_number;
    private String bank_account_number;
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(String bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
       String text = "";
       text = "Id " + id + "adress: " + address.toString() + ", surname " + surname + ", name " +
               name + ", patronymic "+ patronymic + ", card_number " + card_number + ", bank_account_number " + bank_account_number +
               ".";
       return text;
    }

    public Customer(String surname, String name,
                    String patronymic, String card_number,
                    String bank_account_number, Address address) {
        this.id = ID;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.card_number = card_number;
        this.bank_account_number = bank_account_number;
        this.address = address;
        ID++;
    }

    public static Customer getCostumer (Scanner scanner) {
        Customer customer = new Customer("","","","","",new Address());
        System.out.println("Введите имя: ");
        customer.surname = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        customer.name = scanner.nextLine();
        System.out.println("Введите отчество: ");
        customer.patronymic = scanner.nextLine();
        System.out.println("Введите номер карты: ");
        customer.card_number = scanner.nextLine();
        System.out.println("Введите номер банковского аккаунта: ");
        customer.bank_account_number = scanner.nextLine();
        customer.address = createAdress(scanner);
        return customer;
    }

    public static Address createAdress (Scanner scanner) {
        Address address = new Address();
        System.out.println("Введите город: ");
        address.city = scanner.nextLine();
        System.out.println("Введите название улицы: ");
        address.street = scanner.nextLine();
        System.out.println("Введите номер дома: ");
        address.house = scanner.nextLine();
        return address;
    }


    static class Address {

        private String city;
        private String street;
        private String house;

        @Override
        public String toString() {
            String text = "";
            text = "City " + city + ", street " + street + ", house " + house;
            return text;
        }
    }
    public static class NameComparator implements Comparator <Customer> {

        @Override
        public int compare(Customer o1, Customer o2) {
            if (o1.getSurname() != o2.getSurname()) {
                return o1.getSurname().compareTo(o2.surname);
            }
            if (o1.getName() != o2.getName()) {
                return o1.getName().compareTo(o2.getName());
            }
            return o1.getPatronymic().compareTo(o2.getPatronymic());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(patronymic, customer.patronymic) &&
                Objects.equals(card_number, customer.card_number) &&
                Objects.equals(bank_account_number, customer.bank_account_number) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, card_number, bank_account_number, address);
    }
}

