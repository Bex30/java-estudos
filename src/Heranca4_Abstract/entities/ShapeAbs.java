package Heranca4_Abstract.entities;

import Heranca4_Abstract.entities.enums.Color;

public abstract class ShapeAbs {
    private Color color;

    public ShapeAbs() {
        super();
    }

    public ShapeAbs(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
