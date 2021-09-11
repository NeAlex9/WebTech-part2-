package laba1.arrays.operations;

public class SimpleNumSearcher {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 7, 11};
        for (int i = 0; i < arr.length; i++){
            if (isSimpleNumber(arr[i])){
                System.out.print(i + 1 + " ");
            }
        }
    }

    private static boolean isSimpleNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
