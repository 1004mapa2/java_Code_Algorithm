/**
 * 기본적인 버블정렬
 */

import java.util.Arrays;

public class Ex_22_bubbleSort {
    public int[] bubbleSort(int[] arr) {

        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Ex_22_bubbleSort ex22BubbleSort = new Ex_22_bubbleSort();
        System.out.println(Arrays.toString(ex22BubbleSort.bubbleSort(new int[]{5, 4, 3, 2, 1})));
    }
}
