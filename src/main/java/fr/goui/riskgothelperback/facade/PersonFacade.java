package fr.goui.riskgothelperback.facade;

import fr.goui.riskgothelperback.dto.PersonDTO;
import fr.goui.riskgothelperback.exception.NullNotAllowedException;
import fr.goui.riskgothelperback.exception.PersonAlreadyExistException;
import fr.goui.riskgothelperback.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Endpoints for the persons.
 */
@RestController
@RequestMapping("/person")
public class PersonFacade {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET, value = "/getAllPersons")
    public List<PersonDTO> getAllPersons() {
        return personService.getAllPersons();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addPerson")
    public PersonDTO addPerson(@Validated @RequestBody PersonDTO personDTO)
            throws NullNotAllowedException, PersonAlreadyExistException {
        return personService.addPerson(personDTO);
    }
}
