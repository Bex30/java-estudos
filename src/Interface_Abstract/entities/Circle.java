package Interface_Abstract.entities;

import Interface_Abstract.entities.enums.Color;

public class Circle extends Interface_Abstract.entities.AbstractShape {
    private Double radius;

    public Circle(Color color, Double radius) {
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
