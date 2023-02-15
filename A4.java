package Algo;

import java.util.Arrays;

// 제일 작은 수 제거하기
public class A4 {

	public static void main(String[] args) {

		int[] a = { 10, 5, 1, 4, 6 };
		Solution3 sol = new Solution3();
		System.out.println(Arrays.toString(sol.solution(a)));
	}

}

class Solution3 {
	public int[] solution(int[] arr) {

		int[] fail = { -1 };

		if (arr.length == 1) {
			return fail;
		}
		int[] answer = new int[arr.length - 1];
		int min = 99999;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				continue;
			}
			answer[index++] = arr[i];
		}
		return answer;
	}
}