/**
 * 문제 : 배열에 있는 요소 3개를 곱했을 때 가장 큰 수 구하기
 * 풀이 : 정렬 후 가장 큰 수 3개의 곱과 음수도 있을 경우를 고려하여 가장 작은 수 2개와 가장 큰 수 1개의 곱을 비교
 */

import java.util.Arrays;
public class Ex_21_largestProductOfThree {
    public int largestProductOfThree(int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        int max3 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        int min2max1 = arr[0] * arr[1] * arr[arr.length - 1];

        if (max3 > min2max1) {
            answer = max3;
        } else {
            answer = min2max1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex_21_largestProductOfThree ex21LargestProductOfThree = new Ex_21_largestProductOfThree();
        System.out.println(ex21LargestProductOfThree.largestProductOfThree(new int[]{-1, 2, -5, 7}));
    }
}
