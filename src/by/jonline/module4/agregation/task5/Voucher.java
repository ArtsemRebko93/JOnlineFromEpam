package by.jonline.module4.agregation.task5;

import java.util.Comparator;

/*
Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Voucher {
    private String country;
    private int price;
    private Transport transport;
    private Type_Voucher typeVoucher;
    private Type_Food typeFood;
    private int countDays;


    @Override
    public String toString() {
        return "Тип ваучера - " + typeVoucher.name() + " , питание - " + typeFood.name() + ", кол-во полных дней в путевке - " + countDays +
                ", страна назначения - " + country + ", транспорт - " + transport.name() + ", price - " + price + ".";
    }

    public Voucher(String country, int price, Transport transport, Type_Voucher typeVoucher, Type_Food typeFood, int countDays) {
        this.country = country;
        this.price = price;
        this.transport = transport;
        this.typeVoucher = typeVoucher;
        this.typeFood = typeFood;
        this.countDays = countDays;
    }

    public String getCountry() {
        return country;
    }

    public Transport getTransport() {
        return transport;
    }

    public int getPrice() {
        return price;
    }

    public Type_Voucher getTypeVoucher() {
        return typeVoucher;
    }

    public Type_Food getTypeFood() {
        return typeFood;
    }

    public int getCountDays() {
        return countDays;
    }

     static class PriceComparator implements Comparator<Voucher> {

        @Override
        public int compare(Voucher o1, Voucher o2) {
            return o1.getPrice() - o2.getPrice();
        }
    }
}
