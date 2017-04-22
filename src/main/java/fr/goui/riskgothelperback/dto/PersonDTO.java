package fr.goui.riskgothelperback.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * The data transfer object for a person.
 */
@EqualsAndHashCode
public class PersonDTO {

    private String name;

    /**
     * Number of times this person has won a game.
     */
    @Getter
    @Setter
    @NotNull
    private int first;

    /**
     * Number of times this person has placed second.
     */
    @Getter
    @Setter
    @NotNull
    private int second;

    /**
     * Number of times this person has placed third.
     */
    @Getter
    @Setter
    @NotNull
    private int third;
}
