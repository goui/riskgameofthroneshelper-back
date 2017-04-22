package fr.goui.riskgothelperback.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception thrown when trying to create a person already in the database.
 */
@ResponseStatus(value = HttpStatus.CONFLICT, reason = "This person already exists")
public class PersonAlreadyExistException extends Exception {
}
