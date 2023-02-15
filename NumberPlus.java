package codingtest;

public class NumberPlus {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		Solution55 sol1 = new Solution55();
		System.out.println(sol.solution(1234));
		System.out.println(sol1.solution(1234));
	}

}

class Solution5 {
	public int solution(int n) {
		int answer = 0;
		String a = n + "";
		for (int i = 0; i < a.length() - 1; i++) {
			if (n != 0) {
				answer += n % 10;
				n = n / 10;
			}
			if (n < 10) {
				answer += n;
			}
		}
		return answer;
	}
}

class Solution55 {
	public int solution(int n) {
		int answer = 0;

		while (n != 0) {
			answer += n % 10;
			n = n / 10;
		}
		return answer;
	}
}