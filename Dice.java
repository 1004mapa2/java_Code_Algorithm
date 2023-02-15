package codingtest;

public class Dice {

	public static void main(String[] args) {
		int[] x = { 10, 8, 6 };
		Solution11 sol = new Solution11();
		System.out.println(sol.solution(x, 3));

	}

}

class Solution11 {
	public int solution(int[] box, int n) {
		int answer = 1;

		for (int i = 0; i < box.length; i++) {
			answer *= box[i] / n;
		}

		return answer;
	}
}