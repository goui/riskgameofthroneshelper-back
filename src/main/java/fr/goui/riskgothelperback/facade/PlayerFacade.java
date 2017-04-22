package fr.goui.riskgothelperback.facade;

import fr.goui.riskgothelperback.dto.PlayerDTO;
import fr.goui.riskgothelperback.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Endpoints for the players.
 */
@RestController
@RequestMapping("/player")
public class PlayerFacade {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.GET, value = "/getAllPlayers")
    public List<PlayerDTO> getAllPlayers() {
        return playerService.getAllPlayers();
    }
}
