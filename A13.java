package Algo;

import java.util.Arrays;

// 진료 순서 정하기
public class A13 {

	public static void main(String[] args) {

		int[] a = { 3, 2, 1 };
		Solution13 sol = new Solution13();
		System.out.println(Arrays.toString(sol.solution(a)));
		Solution13$ sol1 = new Solution13$();
		System.out.println(Arrays.toString(sol1.solution(a)));
	}

}

class Solution13 {
	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		int[] x = new int[emergency.length];

		for (int i = 0; i < emergency.length; i++) {
			x[i] = emergency[i];
		}

		Arrays.sort(x);

		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (x[i] == emergency[j]) {
					answer[j] = emergency.length - i;
				}
			}
		}

		return answer;
	}
}

class Solution13$ {
	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		for (int i = 0; i < emergency.length; i++) {
			answer[i]++;
			for (int j = 0; j < emergency.length; j++) {
				if (emergency[i] < emergency[j])
					answer[i]++;
			}
		}
		return answer;
	}
}