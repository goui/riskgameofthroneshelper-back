package fr.goui.riskgothelperback.service;

import fr.goui.riskgothelperback.dao.PersonRepository;
import fr.goui.riskgothelperback.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The service for the persons.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<PersonDTO> getAllPersons() {
        return personRepository
                .findAll()
                .stream()
                .map(person ->
                        new PersonDTO(person.getName(), person.getFirst(), person.getSecond(), person.getThird()))
                .collect(Collectors.toList());
    }
}
