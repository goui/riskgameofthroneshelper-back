package fr.goui.riskgothelperback.dao;

import fr.goui.riskgothelperback.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The data access object for the color table.
 */
public interface ColorRepository extends JpaRepository<Color, Long> {
}
