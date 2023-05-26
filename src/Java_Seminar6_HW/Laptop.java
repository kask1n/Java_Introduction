package Java_Seminar6_HW;

public class Laptop {
    private String vendor;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    private int diagonal;

    public Laptop(String vendor, int ram, int hdd, String os, String color, int diagonal) {
        this.vendor = vendor;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        this.diagonal = diagonal;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
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

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format("%-14s %-7s %-9s %-11s %-13s %-11s",
                "vendor=" + vendor + ",",
                "ram=" + ram + ",",
                "hdd=" + hdd + ",",
                "os=" + os + ",",
                "color=" + color + ",",
                "diagonal=" + diagonal);
    }

    public static boolean filterBy(int value, int filter) {  // Фильтр для числовых критериев.
        return value < filter;
    }

    public static boolean filterBy(String value, String filter) {  // Фильтр для строковых критериев.
        return !value.equals(filter);
    }
}