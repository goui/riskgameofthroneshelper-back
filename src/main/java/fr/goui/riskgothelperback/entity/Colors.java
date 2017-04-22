package fr.goui.riskgothelperback.entity;

import java.util.List;

/**
 * Colors container.
 */
public class Colors {

    private List<Color> colors;

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "colors=" + colors +
                '}';
    }
}
