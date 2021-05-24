package by.jonline.module4.agregation.task4;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Account {

    private static int NUMBER_ID;
    private int accountNumber;
    private double balance = 0;
    private boolean available = true;

    public Account (double balance) {
        accountNumber = ++NUMBER_ID;
        this.balance = balance;
    }
    public void block () {
        available = false;
    }
    public void unLock () {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }

    private String chekState () {
        String state = isAvailable()? " Разблокирован" : " Заблокирован";
        return state;
    }

    @Override
    public String toString() {
        return "Номер аккаунта - " + accountNumber +
                " ; баланс - " + balance + " состояние - " + chekState();
    }


}
