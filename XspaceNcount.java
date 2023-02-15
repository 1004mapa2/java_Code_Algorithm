package codingtest;

import java.util.Arrays;

public class XspaceNcount {

	public static void main(String[] args) {
//		Solution22 sol = new Solution22();
//		System.out.println(Arrays.toString(sol.solution(5, 5)));
		Solution2222 sol1 = new Solution2222();
		System.out.println(Arrays.toString(sol1.solution(10000000, 1000)));

	}

}

class Solution22 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];

		for (long i = 1; i <= n; i++) {
			answer[(int) i - 1] = x * i;
		}
		return answer;
	}
}

class Solution2222 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];

		answer[0] = x;
		for (int i = 1; i < n; i++) {
			answer[i] = (long)x * (i + 1);
		}
		return answer;
	}
}