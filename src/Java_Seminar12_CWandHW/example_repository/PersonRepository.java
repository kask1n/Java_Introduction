package Java_Seminar12_CWandHW.example_repository;

import java.util.List;

public interface PersonRepository extends Repository<Person, Integer>{

    List<Person> getByAge(int age);

}
