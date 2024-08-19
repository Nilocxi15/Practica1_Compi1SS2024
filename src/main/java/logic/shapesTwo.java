package logic;

public class shapesTwo {
    private String name, color;
    private int posx, posy, numbOne, numbTwo;

    public shapesTwo(String name, String color, int posx, int posy, int numbOne, int numbTwo) {
        this.name = name;
        this.color = color;
        this.posx = posx;
        this.posy = posy;
        this.numbOne = numbOne;
        this.numbTwo = numbTwo;
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

    public int getNumbTwo() {
        return numbTwo;
    }
}
