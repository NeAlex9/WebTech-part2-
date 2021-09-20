package laba1.classesAndObjects.ballAndBin;

public class Main {
    public static void main(String[] args) {
        var bin = new Bin();
        int weight = 320;
        for (int i = 0; i < 3; i++) {
            var ball = new Ball("blue", weight);
            bin.addBall(ball);
            weight += 100;
        }

        bin.addBall(new Ball("green", 200));
        System.out.println("There are " + bin.countBalls("blue") + " blue balls in bin");
        System.out.println("Result weight is " + bin.getAllWeight() + " gramm");
    }
}
