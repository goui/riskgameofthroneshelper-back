package fr.goui.riskgothelperback.dao;

import fr.goui.riskgothelperback.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The data access object for the person table.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByName(String name);
}
