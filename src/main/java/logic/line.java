package logic;

public class line {
    private String name, color;
    private int posx, posy, posxfinal, posyfinal;

    public line(String name, String color, int posx, int posy, int posxfinal, int posyfinal) {
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

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public int getPosxfinal() {
        return posxfinal;
    }

    public int getPosyfinal() {
        return posyfinal;
    }
    
}
