package tech.yashtiwari.Spring101.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import tech.yashtiwari.Spring101.dao.PersonDao;
import tech.yashtiwari.Spring101.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("dao") PersonDao personDao){
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.addPerson(person);
    }

    public List<Person> getAllPerson(){
        return personDao.getAllPerson();
    }

    public boolean removePerson(UUID uuid){
        return personDao.removePerson(uuid);
    }

    public boolean updatePerson(UUID id, String name){
        return personDao.updatePerson(id, name);
    }

    public Optional<Person> getPerson(UUID uuid) {
        return personDao.getPerson( uuid);
    }
}
