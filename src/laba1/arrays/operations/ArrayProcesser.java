package laba1.arrays.operations;

public class ArrayProcesser {
    public static void main(String[] args) {

    }

    private static boolean isSimpleNumber(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }
}
