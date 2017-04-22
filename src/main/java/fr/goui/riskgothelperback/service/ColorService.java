package fr.goui.riskgothelperback.service;

import fr.goui.riskgothelperback.dao.ColorRepository;
import fr.goui.riskgothelperback.dto.ColorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The service for the colors.
 */
@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public List<ColorDTO> getAllColors() {
        return colorRepository
                .findAll()
                .stream()
                .map(color -> new ColorDTO(color.getHexCode(), color.getName()))
                .collect(Collectors.toList());
    }
}
