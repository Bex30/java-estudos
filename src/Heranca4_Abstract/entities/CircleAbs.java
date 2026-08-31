package Heranca4_Abstract.entities;

import Heranca4_Abstract.entities.enums.Color;

public class CircleAbs extends ShapeAbs {
    private Double radius;

    public CircleAbs() {
        super();
    }

    public CircleAbs(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
