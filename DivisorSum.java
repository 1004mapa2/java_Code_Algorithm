package codingtest;

public class DivisorSum {

	public static void main(String[] args) {
		
		Solution15 sol = new Solution15();
		System.out.println(sol.solution(5));

	}

}

class Solution15 {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}

		return answer;
	}
}