package by.jonline.module4.agregation.task3;

public class Test {
    public static void main(String[] args) {
        City brest = new City(CityName.BREST,true);
        City ghomel = new City(CityName.GHOMEL,true);
        City grodno = new City(CityName.GRODNO,true);
        City mogilev = new City(CityName.MOGILEV,true);
        City zhlobin = new City(CityName.ZHLOBIN);

        Region region1 = new Region("Gomelskay");
        Region region2 = new Region("Brestkay");
        Region region3 = new Region("Vitebskay");
        Region region4 = new Region("Minskay");
        Region region5 = new Region("Mogilevskay");

        District district1 = new District("Zhlobinski");
        District district2 = new District("Byda");
        District district3 = new District("Baranovichski");
        District district4 = new District("Pripyatski");

        State state = new State();
        state.addCity(zhlobin);
        state.addCity(mogilev);
        state.addCity(ghomel);
        state.addCity(grodno);
        state.addCity(brest);

        state.addDistrict(district1);
        state.addDistrict(district2);
        state.addDistrict(district3);
        state.addDistrict(district4);

        state.addRegion(region1);
        state.addRegion(region2);
        state.addRegion(region3);
        state.addRegion(region4);
        state.addRegion(region5);

        System.out.println(state.getSquareState());
        state.printCountRegion();
        state.printAllRegionCenter();
        state.printCapital();
    }
}
