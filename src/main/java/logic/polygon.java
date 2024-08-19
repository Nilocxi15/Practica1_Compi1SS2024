package logic;

public class polygon {
    private String name, color;
    private int posx, posy, sides, width, height;

    public polygon(String name, String color, int posx, int posy, int sides, int width, int height) {
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

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public int getSides() {
        return sides;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
