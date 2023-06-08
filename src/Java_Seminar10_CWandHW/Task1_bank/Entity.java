package Java_Seminar10_CWandHW.bank;

public class Entity implements PersonalData {
    private final String name;
    private final String inn;

    public String getFio() {
        return name;
    }

    @Override
    public String getInn() {
        return inn;
    }

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", inn, name);
    }
}