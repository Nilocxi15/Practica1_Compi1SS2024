package logic;

public class rectangle {
    private String name, color;
    private double posx, posy, width, height;

    public rectangle(String name, String color, double posx, double posy, double width, double height) {
        this.name = name;
        this.color = color;
        this.posx = posx;
        this.posy = posy;
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

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
}
