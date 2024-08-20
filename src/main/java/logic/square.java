package logic;

public class square {
    
    private String name, color;
    private double posx, posy, lenght;

    public square(String name, String color, double posx, double posy, double lenght) {
        this.name = name;
        this.color = color;
        this.posx = posx;
        this.posy = posy;
        this.lenght = lenght;
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

    public double getLenght() {
        return lenght;
    }
    
}
