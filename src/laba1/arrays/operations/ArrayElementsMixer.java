package laba1.arrays.operations;

public class ArrayElementsMixer {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        shuffleElements(arr);
    }

    private static void shuffleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(getNextElem(arr, i + j) + " ");
            }

            System.out.println();
        }
    }

    private static int getNextElem(int[] arr, int nextIndex) {
        return arr[nextIndex % arr.length];
    }
}
