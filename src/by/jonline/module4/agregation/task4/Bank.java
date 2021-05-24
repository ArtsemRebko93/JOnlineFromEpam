package by.jonline.module4.agregation.task4;

import java.util.ArrayList;

public class Bank {

    private ArrayList <Client> clients;
    private String name;

    public Bank (String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public void addClient (Client client) {
        clients.add(client);
    }

    public Client getClient (String password) {
        for (Client client: clients) {
            if (client.getPassword().equals(password)) {
                return client;
            }
        }
        return null;
    }

    public void showCountClients () {
        System.out.printf("%d - текущее количество клиентов",clients.size());
    }
}
