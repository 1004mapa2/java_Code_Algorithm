package codingtest;

import java.util.Arrays;

public class Maxnumber {

	public static void main(String[] args) {
		int[] x = { 9, 10, 11, 8, 20 };
		Solution19 sol = new Solution19();
		System.out.println(Arrays.toString(sol.solution(x)));
	}

}

class Solution19 {
	public int[] solution(int[] array) {
		int[] answer = new int[2];
		int max = 0;
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				num = i;
			}
		}
		answer[0] = max;
		answer[1] = num;

		return answer;
	}
}