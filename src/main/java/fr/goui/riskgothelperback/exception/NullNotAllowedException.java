package fr.goui.riskgothelperback.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception thrown when trying to call with a null value.
 */
@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE, reason = "Null value not allowed here")
public class NullNotAllowedException extends Exception {
}
