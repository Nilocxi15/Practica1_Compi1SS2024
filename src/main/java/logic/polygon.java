package logic;

public class polygon {
    private String name, color;
    private double posx, posy, width, height;
    private int sides;

    public polygon(String name, String color, double posx, double posy, int sides, double width, double height) {
        this.name = name;
        this.color = color;
        this.posx = posx;
        this.posy = posy;
        this.sides = sides;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPosx() {
        return posx;
    }

    public double getPosy() {
        return posy;
    }

    public double getSides() {
        return sides;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
