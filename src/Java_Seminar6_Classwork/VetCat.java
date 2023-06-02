/* Задача 2.
 * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архивом выставки котов
 * в) информационной системой Театра кошек Ю. Д. Куклачёва
 * Можно записать в текстовом виде, не обязательно реализовывать в java.
 */

package Java_Seminar6_Classwork;

import java.time.LocalDate;
import java.util.Date;

//поля или названия параметров
public class VetCat {
    private String name;
    private String breed;
    private String color;
    private String ownerName;
    private LocalDate dateOfBirth;
    private String phone;
    // private List<Diagonsis> история болезни
    private char sex; // M, F

    // Конструктор

    public VetCat(String name, String breed, String color, String ownerName,
                  LocalDate dateOfBirth, String phone, char sex) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.ownerName = ownerName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.sex = sex;
    }

    // Get и Set-методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalStateException("Имя не может быть null");
        }
        this.name = name;
    }

    public String getBread() {
        return breed;
    }

    public void setBread(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "VetCat [name=" + name + ", breed=" + breed + ", color=" + color + ", ownerName=" + ownerName
                + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", sex=" + sex + "]";
    }
}