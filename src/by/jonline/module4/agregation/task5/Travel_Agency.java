package by.jonline.module4.agregation.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Travel_Agency {
    private ArrayList<Voucher> vouchers;
    private ArrayList<Client> clients;
    private ArrayList <Voucher> clientVoucher;


    public Travel_Agency() {
        vouchers = new ArrayList<>();
        clients = new ArrayList<>();
        clientVoucher = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addVoucher (Voucher voucher) {
        vouchers.add(voucher);
    }

    public void getInfoAllVouchers () {
        for (Voucher voucher : vouchers) {
            System.out.println(voucher.toString());
        }
    }

    public ArrayList <Voucher> getInfoByOptions (Type_Voucher voucher) {
        for (Voucher pytevka : vouchers) {
            if (pytevka.getTypeVoucher().name().equalsIgnoreCase(voucher.name())) {
                clientVoucher.add(pytevka);
            }
        }
        return clientVoucher;
    }

    public ArrayList <Voucher> getInfoByOptions (Type_Food voucher) {
        for (Voucher pytevka : vouchers) {
            if (pytevka.getTypeFood().name().equalsIgnoreCase(voucher.name())) {
                clientVoucher.add(pytevka);
            }
        }
        return clientVoucher;
    }

    public ArrayList <Voucher> getInfoByOptions (Transport voucher) {
        for (Voucher pytevka : vouchers) {
            if (pytevka.getTransport().name().equalsIgnoreCase(voucher.name())) {
                clientVoucher.add(pytevka);
            }
        }
        return clientVoucher;
    }

    public ArrayList <Voucher> getInfoByOptions (Transport voucher, Type_Food typeFood) {
        for (Voucher pytevka : vouchers) {
            if (pytevka.getTransport().name().equalsIgnoreCase(voucher.name()) && pytevka.getTypeFood().name().equalsIgnoreCase(typeFood.name())) {
                clientVoucher.add(pytevka);
            }
        }
        return clientVoucher;
    }

    public ArrayList <Voucher> getInfoByOptions (Transport voucher, Type_Food typeFood, int countOfDay) {
        for (Voucher pytevka : vouchers) {
            if (pytevka.getTransport().name().equalsIgnoreCase(voucher.name()) && pytevka.getTypeFood().name().equalsIgnoreCase(typeFood.name()) &&
            pytevka.getCountDays() == countOfDay) {
                clientVoucher.add(pytevka);
            }
        }
        return clientVoucher;
    }

    public void printClientVoucher (ArrayList <Voucher> vouchers) {
        for (Voucher voucher: vouchers) {
            System.out.println(voucher.toString());
        }
    }


    public void sortByCountDays() {
        vouchers.sort(Comparator.comparing(Voucher::getCountDays));

    }

    public void sortByPrice () {
        Collections.sort(vouchers,new Voucher.PriceComparator());
    }

}
