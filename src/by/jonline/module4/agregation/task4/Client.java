package by.jonline.module4.agregation.task4;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {

    private String surname;
    private String name;
    private String password;
    private ArrayList <Account> accounts;

    public Client(String surname, String name, String password) {
        this.surname = surname;
        this.name = name;
        this.password = password;
        accounts = new ArrayList<>();
    }

    public String getPassword() {
        return password;
    }

    public void getBalance () {
        double balance = 0;
        for (Account account: accounts) {
            balance += account.getBalance();
        }
        System.out.printf("%d - текущая сумма общего баланса на ваших счетах.\n",balance);
    }

    public void getPositiveBalance() {
        double balance = 0;
        for (Account account: accounts) {
            if (account.getBalance() > 0) {
                balance += account.getBalance();
            }
        }
        System.out.printf("%d - текущая сумма положительного баланса на ваших счетах.\n",balance);
    }
    public void getNegativeBalance() {
        double balance = 0;
        for (Account account: accounts) {
            if (account.getBalance() < 0) {
                balance += account.getBalance();
            }
        }
        System.out.printf("%f - текущая сумма отрицательного баланса на ваших счетах.\n",balance);
    }

    public void creteAccount (double balance) {
        accounts.add(new Account(balance));
    }

    public void sortByBalance () {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public void showInfo () {
        String info = "";
        for (Account account: accounts) {
            info += account.toString() + "\n";
        }
        System.out.println("\nInfo all your account's: \n" + info);
    }

    public void blockAccount (int accountNumber) {
        for (Account account: accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.block();
            }
        }
    }
    public void unlockAccount (int accountNumber) {
        for (Account account: accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.unLock();
            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Клиент по фамилии " +
                surname + " и по имени " + name;
    }

    class NameComparator implements Comparator <Client> {

        @Override
        public int compare(Client o1, Client o2) {
            if (o1.getSurname() != o2.getSurname()) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
            return o2.getName().compareTo(o2.getName());

        }
    }
}
