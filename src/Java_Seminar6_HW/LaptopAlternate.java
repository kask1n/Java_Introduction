package Java_Seminar6_HW;

//      1 - ОЗУ
//      2 - Объём ЖД
//      3 - Операционная система
//      4 - Цвет …

public class LaptopAlternate {
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public LaptopAlternate(String model, int ram, int hdd, String os, String color) {

        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "LaptopAlter{" +
                "model='" + model + '\'' +
                ", ram=" + ram + "GB" +
                ", hdd=" + hdd + "GB" +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}