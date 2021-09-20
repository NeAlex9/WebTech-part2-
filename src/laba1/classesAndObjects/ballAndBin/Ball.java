package laba1.classesAndObjects.ballAndBin;

public class Ball {
    private final String color;
    private final int weight;
    public Ball(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor(){
        return color;
    }

    public int getWeight(){
        return weight;
    }
}
