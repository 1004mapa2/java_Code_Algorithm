package codingtest;

public class CompositeNumber {

	public static void main(String[] args) {

		Solution35 sol = new Solution35();
		System.out.println(sol.solution(15));
	}

}

class Solution35 {
	public int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			int count = 0;
			for(int j = 1; j < i + 1; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count > 2) {
				answer++;
			}
		}

		return answer;
	}
}