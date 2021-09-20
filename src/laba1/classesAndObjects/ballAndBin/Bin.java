package laba1.classesAndObjects.ballAndBin;

import java.util.ArrayList;

public class Bin {
    public ArrayList<Ball> balls;

    public Bin(){
        balls = new ArrayList<Ball>();
    }
    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int countBalls(String color){
        int count = 0;
        for (var ball : balls){
            if (ball.getColor() == color){
                count++;
            }
        }

        return count;
    }

    public int getAllWeight(){
        int sumWeight = 0;
        for (var ball : balls){
            sumWeight += ball.getWeight();
        }

        return sumWeight;
    }
}
