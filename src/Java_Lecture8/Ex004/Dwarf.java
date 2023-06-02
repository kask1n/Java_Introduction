package Java_Lecture8.Ex004;

public class Dwarf extends Druid {
    
    public Dwarf(String name, int hp) {
        super();  // Через супер обращаемся к родительскому классу.
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("Вызван Dwarf()");
    }
   
}