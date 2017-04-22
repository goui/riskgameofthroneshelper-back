package fr.goui.riskgothelperback.dao;

import fr.goui.riskgothelperback.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The data access object for the game table.
 */
public interface GameRepository extends JpaRepository<Game, Long> {
}
