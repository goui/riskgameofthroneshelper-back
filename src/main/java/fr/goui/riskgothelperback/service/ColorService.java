package fr.goui.riskgothelperback.service;

import fr.goui.riskgothelperback.dao.ColorRepository;
import fr.goui.riskgothelperback.dto.ColorDTO;
import fr.goui.riskgothelperback.entity.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The service for the colors.
 */
@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public List<ColorDTO> getAllColors() {
        List<ColorDTO> colorDTOs = new ArrayList<>();
        List<Color> colors = colorRepository.findAll();
        // TODO map colors
        return colorDTOs;
    }
}
