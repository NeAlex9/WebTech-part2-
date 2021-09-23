package laba1.arrays.operations;

public class ShellSorter {
    public static void main(String[] args) {
        double[] arr = new double[]{3, 9.8, 0.2, 1, 7, 11};
        ShellSort(arr);
        for (double element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void ShellSort(double[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                swap(array, i, i+1);
                i = i > 0 ? i - 1 : i;
            }
        }
    }

    private static void swap(double[] array, int a, int b) {
        double buf = array[a];
        array[a] = array[b];
        array[b] = buf;
    }
}
