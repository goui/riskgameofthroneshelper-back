package fr.goui.riskgothelperback.dao;

import fr.goui.riskgothelperback.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The data access object for the player table.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
