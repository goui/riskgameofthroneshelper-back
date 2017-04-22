package fr.goui.riskgothelperback.service;

import fr.goui.riskgothelperback.dao.PersonRepository;
import fr.goui.riskgothelperback.dto.PersonDTO;
import fr.goui.riskgothelperback.entity.Person;
import fr.goui.riskgothelperback.exception.NullNotAllowedException;
import fr.goui.riskgothelperback.exception.PersonAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    public PersonDTO addPerson(PersonDTO personDTO) throws NullNotAllowedException, PersonAlreadyExistException {
        if (!StringUtils.isEmpty(personDTO.getName())) {
            Person person = personRepository.findByName(personDTO.getName());
            if (person == null) {
                person = new Person();
                person.setName(personDTO.getName());
                person.setFirst(0);
                person.setSecond(0);
                person.setThird(0);
                personRepository.save(person);
                return new PersonDTO(personDTO.getName(), 0, 0, 0);
            } else {
                throw new PersonAlreadyExistException();
            }
        } else {
            throw new NullNotAllowedException();
        }
    }
}
