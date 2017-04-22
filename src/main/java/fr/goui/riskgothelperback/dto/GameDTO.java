package fr.goui.riskgothelperback.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * The data transfer object for a game.
 */
@EqualsAndHashCode(exclude = "players")
public class GameDTO {

    @Getter
    @Setter
    @NotNull
    private ZonedDateTime date;

    @Getter
    @Setter
    @NotNull
    private List<PlayerDTO> players;
}
