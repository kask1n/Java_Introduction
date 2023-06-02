package Java_Seminar6_Classwork;

public class Cat {
    private String name = null;   // Поле класса (field)
    private String breed = null;   // Порода

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public boolean equals(Object other) {   // Метод (method)
        return true;
    }
}