package tech.yashtiwari.Spring101.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.yashtiwari.Spring101.model.Person;
import tech.yashtiwari.Spring101.service.PersonService;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //Post Request
    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    //Post Request
    @GetMapping
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @DeleteMapping(path = "{id}")
    public boolean removePerson(@PathVariable("id") UUID uuid) {
        return personService.removePerson(uuid);
    }

    @PutMapping(path = "update")
    public boolean updatePerson(@RequestParam UUID id, @RequestParam String name) {
        return personService.updatePerson(id, name);
    }

    @GetMapping(path = "{id}")
    public Person getPerson(@PathVariable("id") UUID uuid){
        return personService.getPerson(uuid).orElse(null);
    }

}































