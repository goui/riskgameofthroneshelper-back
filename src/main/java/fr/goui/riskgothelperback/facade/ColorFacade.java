package fr.goui.riskgothelperback.facade;

import fr.goui.riskgothelperback.dto.ColorDTO;
import fr.goui.riskgothelperback.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Endpoints for the colors.
 */
@RestController
@RequestMapping("/color")
public class ColorFacade {

    @Autowired
    private ColorService colorService;

    @RequestMapping(method = RequestMethod.GET, value = "/getAllColors")
    public List<ColorDTO> getAllColors() {
        return colorService.getAllColors();
    }
}
