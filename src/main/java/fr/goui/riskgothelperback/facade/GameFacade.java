package fr.goui.riskgothelperback.facade;

import fr.goui.riskgothelperback.dto.GameDTO;
import fr.goui.riskgothelperback.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Endpoints for the games.
 */
@RestController
@RequestMapping("/game")
public class GameFacade {

    @Autowired
    private GameService gameService;

    @RequestMapping(method = RequestMethod.GET, value = "/getAllGames")
    public List<GameDTO> getAllGames() {
        return gameService.getAllGames();
    }
}
