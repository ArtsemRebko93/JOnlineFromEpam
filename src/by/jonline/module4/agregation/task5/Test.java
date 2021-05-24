package by.jonline.module4.agregation.task5;

public class Test {
    public static void main(String[] args) {
        Travel_Agency agency = new Travel_Agency();
        Voucher voucher1 = new Voucher("Egypt",300,Transport.AIRLINE,Type_Voucher.RELAX,Type_Food.ALL_INCLUSIVE,15);
        Voucher voucher2 = new Voucher("Denmark",1000,Transport.BUS,Type_Voucher.THERAPY,Type_Food.BREAKFASTS,14);
        Voucher voucher3 = new Voucher("Turkey",500,Transport.AIRLINE,Type_Voucher.RELAX,Type_Food.ALL_INCLUSIVE,10);
        Voucher voucher4 = new Voucher("Litva",100,Transport.BUS,Type_Voucher.SHOPPING,Type_Food.NO_FOOD,2);
        Voucher voucher5 = new Voucher("France",200,Transport.RAILWAY,Type_Voucher.SHOPPING,Type_Food.NO_FOOD,4);
        Voucher voucher6 = new Voucher("Brazil",2000,Transport.SHIP,Type_Voucher.CRUISE,Type_Food.ALL_INCLUSIVE,20);
        agency.addVoucher(voucher1);
        agency.addVoucher(voucher2);
        agency.addVoucher(voucher3);
        agency.addVoucher(voucher4);
        agency.addVoucher(voucher5);
        agency.addVoucher(voucher6);
        Client client = new Client("Rebko","Artsem",6333425);
        agency.addClient(client);
        agency.sortByCountDays();
        agency.getInfoAllVouchers();
        System.out.println();
        agency.sortByPrice();
        agency.getInfoAllVouchers();
        System.out.println();
        agency.printClientVoucher(agency.getInfoByOptions(Transport.AIRLINE,Type_Food.ALL_INCLUSIVE,15));

    }
}
