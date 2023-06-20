package Java_Lecture10.Ex006;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Ex001_Game {
    public static void main(String[] args) {
        System.out.println("Ex001_Game");

        Team team1 = new Team("Воробушки");
        team1.add(Gb.CreateEmployee(0));
        team1.add(Gb.CreateEmployee());
        System.out.println(team1);

        Team team2 = new Team("Хлебушки ");
        team2.add(Gb.CreateEmployee(0));
        team2.add(Gb.CreateEmployee(10));
        team2.add(Gb.CreateEmployee(1));  //
        System.out.println(team2);

        var o = new Olympiad(team1, team2);
        o.start();

    }
}

abstract class Programmer {
    private final String fullName;
    private final int age;

    public Programmer() {
        Random r = new Random();
        String tName = UUID.randomUUID().toString().substring(0, 5);
        int tAge = r.nextInt(18, 55);
        this.fullName = String.format("Имя_%s", tName);
        this.age = tAge;
    }

    @Override
    public String toString() {

        String sn = this.getClass().getSimpleName();
        return String.format("[%s %d >%s]", fullName, age, sn);
    }
}

class Intern extends Programmer {
    public Intern() {
        super();
    }
}

class Junior extends Programmer {
    public Junior() {
        super();
    }
}

class Middle extends Programmer {
    public Middle() {
        super();
    }
}

class Principal extends Programmer {
    public Principal() {
        super();
    }
}

class Team {
    private final String name;
    private final List<Programmer> programmers;

    public Team(String name) {
        this.name = name;
        programmers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Programmer p) {
        programmers.add(p);
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, programmers);
    }

}

class Olympiad {

    Team team1, team2;
    Random r = new Random();

    public Olympiad(Team t1, Team t2) {
        team1 = t1;
        team2 = t2;
    }

    public void start() {
        String winner = r.nextInt(2) == 0 ? team1.getName() : team2.getName();
        System.out.printf("Winner: %s%n", winner);
    }
}

class Gb {

    public static Programmer CreateEmployee(int i) {
        return switch (i) {
            case 0 -> new Intern();
            case 1 -> new Middle();
            default -> new Principal();
        };
    }

    public static Programmer CreateEmployee() {
        return CreateEmployee(0);
    }

}