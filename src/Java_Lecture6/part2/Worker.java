package Java_Lecture6.part2;

public class Worker {
    int id;
    int salary;
    String lastName;
    String firstName;

    @Override
    public String toString() {
        return String.format("id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object obj) {  // Переопределение метода стандартного метода equals.
        var t = (Worker) obj;  // Кастуем объект в переменную класса Worker.
        return id == t.id && firstName == t.firstName;  // Одинаковые ID и имя = Одинаковые экземпляры.
    }

    @Override
    public int hashCode() {  // Переопределение хеш-функции, которая использует метод equals.
        return id;
    }
}