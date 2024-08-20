package logic;

public class line {
    private String name, color;
    private double posx, posy, posxfinal, posyfinal;

    public line(String name, String color, double posx, double posy, double posxfinal, double posyfinal) {
        this.name = name;
        this.color = color;
        this.posx = posx;
        this.posy = posy;
        this.posxfinal = posxfinal;
        this.posyfinal = posyfinal;
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

    public double getPosxfinal() {
        return posxfinal;
    }

    public double getPosyfinal() {
        return posyfinal;
    }
    
}
