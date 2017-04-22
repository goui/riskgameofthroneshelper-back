package fr.goui.riskgothelperback.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * The data transfer object for a color.
 */
@EqualsAndHashCode
public class ColorDTO {

    @Getter
    @Setter
    @NotNull
    private String hexCode;

    @Getter
    @Setter
    @NotNull
    private String name;

    public ColorDTO(String hexCode, String name) {
        this.hexCode = hexCode;
        this.name = name;
    }
}
