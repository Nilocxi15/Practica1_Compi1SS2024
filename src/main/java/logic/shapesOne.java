package logic;

public class shapesOne {
    private String name, color;
    private int posx, posy, numbOne;

    public shapesOne(String name, String color, int posx, int posy, int numbOne) {
        this.name = name;
        this.color = color;
        this.posx = posx;
        this.posy = posy;
        this.numbOne = numbOne;
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

    public int getNumbOne() {
        return numbOne;
    }
    
}
