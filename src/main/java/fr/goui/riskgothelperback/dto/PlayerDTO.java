package fr.goui.riskgothelperback.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * The data transfer object for a player.
 */
@EqualsAndHashCode
public class PlayerDTO {

    @Getter
    @Setter
    @NotNull
    private String name;

    @Getter
    @Setter
    @NotNull
    private GameDTO game;

    @Getter
    @Setter
    @NotNull
    private PersonDTO person;

    @Getter
    @Setter
    @NotNull
    private ColorDTO color;
}
