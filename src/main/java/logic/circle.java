package logic;

public class circle {
    
    private String name, color;
    private double posx, posy, radius;

    public circle(String name, String color, double posx, double posy, double radius) {
        this.name = name;
        this.color = color;
        this.posx = posx;
        this.posy = posy;
        this.radius = radius;
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

    public double getRadius() {
        return radius;
    }
    
}
