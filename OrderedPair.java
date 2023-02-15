package codingtest;

public class OrderedPair {

	public static void main(String[] args) {

		Solution3 sol = new Solution3();
		System.out.println(sol.solution(100));

	}

}

class Solution3 {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer++;
			}
		}
		return answer;
	}
}