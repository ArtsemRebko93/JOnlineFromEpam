package by.jonline.module4.agregation.task4;

public class Test {
    public static void main(String[] args) {
        Client artem = new Client("Rebko","Artsem", "6333425fhntv");
        artem.creteAccount(100);
        artem.creteAccount(200);
        artem.creteAccount(700);
        Client andrey = new Client("Kychkin","Andrey","123456");
        andrey.creteAccount(60);
        andrey.creteAccount(120);
        andrey.creteAccount(440);
        Client helen = new Client("Rebko","Helen","9034803");
        helen.creteAccount(1000);
        helen.creteAccount(-100);
        helen.creteAccount(-20);
        Bank bank = new Bank("BSB");
        bank.addClient(andrey);
        bank.addClient(artem);
        bank.addClient(helen);
        bank.showCountClients();

        bank.getClient("6333425fhntv").showInfo();
        helen.sortByBalance();
        helen.blockAccount(8);
        helen.showInfo();
        helen.getNegativeBalance();
    }
}
