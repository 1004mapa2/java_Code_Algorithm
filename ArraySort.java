package codingtest;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		Solution20 sol = new Solution20();
		System.out.println(Arrays.toString(sol.solution("abcde0")));
		Solution2020 sol1 = new Solution2020();
		System.out.println(Arrays.toString(sol1.solution("p2o4i8gj2")));
	}

}

class Solution20 {
	public int[] solution(String my_string) {
		int[] answer = {};
		int count = 0;

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) - '0' >= 0 && my_string.charAt(i) - '0' <= 9) {
				count++;
			}
		}
		answer = new int[count];

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) - '0' >= 0 && my_string.charAt(i) - '0' <= 9) {
				answer[count - 1] = my_string.charAt(i) - '0';
				count--;
			}
		}
		Arrays.sort(answer);

		return answer;
	}
}

class Solution2020 {
	public int[] solution(String my_string) {
		my_string = my_string.replaceAll("[a-z]", "");
		
		int[] answer = new int[my_string.length()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = my_string.charAt(i) - '0';
		}
		
		Arrays.sort(answer);
		
		return answer;
	}
}