package codingtest;

import java.util.Arrays;

public class NumberReverse {

	public static void main(String[] args) {
		long x = 123123123123123L;
		Solution18 sol = new Solution18();
		System.out.println(Arrays.toString(sol.solution(x)));
	}

}
class Solution18 {
    public int[] solution(long n) {
        String a = n + "";
        int[] answer = new int[a.length()];
		for(int i = 0; i < a.length(); i++) {
			answer[i] = (int)(n % 10);
			n /= 10;
		}
        return answer;
    }
}