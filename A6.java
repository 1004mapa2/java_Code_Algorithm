package Algo;

import java.util.Arrays;

//2차원으로 만들기
public class A6 {

	public static void main(String[] args) {

		int[] a = { 100, 95, 2, 4, 5, 6, 18, 33, 948 };
		Solution5 sol = new Solution5();
		System.out.println(Arrays.deepToString(sol.solution(a, 3)));
		Solution55 sol1 = new Solution55();
		System.out.println(Arrays.deepToString(sol1.solution(a, 3)));
	}

}

class Solution5 {
	public int[][] solution(int[] num_list, int n) {
		int[][] answer = new int[num_list.length / n][n];
		int x = 0;
		for (int i = 0; i < num_list.length / n; i++) {
			for (int j = 0; j < n; j++) {
				answer[i][j] = num_list[x];
				x++;
			}
		}

		return answer;
	}
}

class Solution55 {
	public int[][] solution(int[] num_list, int n) {
		int[][] answer = {};

		int length = num_list.length;

		answer = new int[length / n][n];

		for (int i = 0; i < length; i++) {
			answer[i / n][i % n] = num_list[i];
		}

		return answer;
	}
}