package laba1.arrays.operations;

public class MaxSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 1, 7, 11};
        System.out.println("result : " + (arr.length - getLenOfMaxSub(arr)));
    }

    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    private static int getLenOfMaxSub(int[] arr) {
        int len = arr.length;
        int[] temp = new int[len];
        for (int i = 0; i < len; ++i) {
            temp[i] = 1;
            for (int j = 0; j < i; ++j)
                if (arr[j] <= arr[i])
                    temp[i] = getMax(temp[i], 1 + temp[j]);
        }

        int maxLen = temp[0];
        for (int i = 0; i < len; ++i)
            maxLen = getMax(maxLen, temp[i]);
        return maxLen;
    }
}
