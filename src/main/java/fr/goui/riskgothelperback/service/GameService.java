package fr.goui.riskgothelperback.service;

import fr.goui.riskgothelperback.dao.GameRepository;
import fr.goui.riskgothelperback.dto.GameDTO;
import fr.goui.riskgothelperback.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The service for the games.
 */
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> getAllGames() {
        List<GameDTO> gameDTOs = new ArrayList<>();
        List<Game> games = gameRepository.findAll();
        // TODO map games
        return gameDTOs;
    }
}
