package fr.goui.riskgothelperback.service;

import fr.goui.riskgothelperback.dao.PlayerRepository;
import fr.goui.riskgothelperback.dto.PlayerDTO;
import fr.goui.riskgothelperback.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The service for the players.
 */
@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<PlayerDTO> getAllPlayers() {
        List<PlayerDTO> playerDTOs = new ArrayList<>();
        List<Player> players = playerRepository.findAll();
        // TODO map players
        return playerDTOs;
    }
}
