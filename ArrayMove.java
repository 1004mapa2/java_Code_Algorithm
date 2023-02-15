package codingtest;

import java.util.Arrays;

public class ArrayMove {

	public static void main(String[] args) {
		int[] a = { 4, 455, 6, 4, -1, 45, 6 };
		Solution24 sol = new Solution24();
		System.out.println(Arrays.toString(sol.solution(a, "left")));

	}

}

class Solution24 {
	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		if (direction.equals("right")) {
			for (int i = 1; i < numbers.length; i++) {
				answer[i] = numbers[i - 1];
			}
			answer[0] = numbers[numbers.length - 1];
		} else {
			for (int i = 0; i < numbers.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
			answer[numbers.length - 1] = numbers[0];
		}

		return answer;
	}
}