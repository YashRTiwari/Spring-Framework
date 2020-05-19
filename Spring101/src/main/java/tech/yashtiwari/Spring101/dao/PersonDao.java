package tech.yashtiwari.Spring101.dao;


import org.springframework.stereotype.Repository;
import tech.yashtiwari.Spring101.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface PersonDao {

    int addPerson(UUID id, Person person);
    List<Person> getAllPerson();
    boolean removePerson(UUID uuid);
    boolean updatePerson(UUID id, String name);
    Optional<Person> getPerson(UUID uuid);

    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return addPerson(id, person);
    }


}
