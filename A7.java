package Algo;

import java.util.Arrays;

//가까운 수
public class A7 {

	public static void main(String[] args) {
		int[] a = { 15, 5, 20 };
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(a, 10));
	}

}

class Solution7 {
	public int solution(int[] array, int n) {
		int answer = 0;
		int a = Integer.MAX_VALUE;
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			if (a > Math.abs(array[i] - n)) {
				a = Math.abs(array[i] - n);
				answer = array[i];
			}
		}

		return answer;
	}
}