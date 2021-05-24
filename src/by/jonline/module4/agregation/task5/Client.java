package by.jonline.module4.agregation.task5;

public class Client {
    private String surname;
    private String name;
    private int passportID;



    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getPassportID() {
        return passportID;
    }

    public Client(String surname, String name, int passportID) {
        this.surname = surname;
        this.name = name;
        this.passportID = passportID;
    }

    @Override
    public String toString() {
        return "Фамилия - " + surname + ", имя - " + name + ".";
    }
}
