package tech.yashtiwari.Spring101.dao;

import org.springframework.stereotype.Repository;
import tech.yashtiwari.Spring101.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("dao")
public class PersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int addPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> getAllPerson() {
        return DB;
    }

    @Override
    public boolean removePerson(UUID uuid) {
        Optional<Person> person = getPerson(uuid);
        if (person.isEmpty()) return false;
        return DB.remove(person.get());
    }

    @Override
    public boolean updatePerson(UUID id, String name) {
        Optional<Person> person = getPerson(id);
        if (person.isEmpty()) return false;
        person.map(person1 -> {
            person1.updateName(name);
            return person1;
        });
        return true;
    }

    @Override
    public Optional<Person> getPerson(UUID uuid) {
        return DB.stream().filter(person -> person.getId().equals(uuid)).findFirst();
    }


}
