package codingtest;

import java.util.ArrayList;
import java.util.Arrays;

public class Multiple {

	public static void main(String[] args) {
		int[] a = { 2, 100, 120, 600, 12, 12 };

		Solution38 sol = new Solution38();
		System.out.println(Arrays.toString(sol.solution(12, a)));
		Solution3838 sol1 = new Solution3838();
		System.out.println(Arrays.toString(sol1.solution(12, a)));
	}

}

class Solution38 {
	public int[] solution(int n, int[] numlist) {
		int[] answer = { -1 };
		int count = 0;

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				count++;
			}
		}
		answer = new int[count];
		int a = count;

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer[count - a] = numlist[i];
				a--;
			}
		}
		return answer;
	}
}

class Solution3838 {
	public int[] solution(int n, int[] numlist) {
		
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				a.add(numlist[i]);
			}
		}
		int[] answer = new int[a.size()];
		for(int i = 0; i < a.size(); i++) {
			answer[i] = a.get(i);
		}
		return answer;
	}
}