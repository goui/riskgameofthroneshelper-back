package fr.goui.riskgothelperback.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.goui.riskgothelperback.dao.ColorRepository;
import fr.goui.riskgothelperback.entity.Colors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

/**
 * Used to import data from json files.
 */
@Service
public class DataService {

    private static final String COLORS_FILE_PATH = "src/main/resources/static/colors.json";

    @Autowired
    private ColorRepository colorRepository;

    public void fromJson() throws IOException {
        // jackson object mapper
        ObjectMapper mapper = new ObjectMapper();
        // unmarshalling json file
        Colors colors = mapper.readValue(new File(COLORS_FILE_PATH), Colors.class);
        // saving all the colors
        if (colors != null) {
            colorRepository.save(colors.getColors());
        }
    }
}
