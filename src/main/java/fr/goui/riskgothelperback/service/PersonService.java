package fr.goui.riskgothelperback.service;

import fr.goui.riskgothelperback.dao.PersonRepository;
import fr.goui.riskgothelperback.dto.PersonDTO;
import fr.goui.riskgothelperback.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The service for the persons.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<PersonDTO> getAllPersons() {
        List<PersonDTO> personDTOs = new ArrayList<>();
        List<Person> persons = personRepository.findAll();
        // TODO map persons
        return personDTOs;
    }
}
