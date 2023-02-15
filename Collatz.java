package codingtest;

public class Collatz {

	public static void main(String[] args) {

		Solution30 sol = new Solution30();
		System.out.println(sol.solution(626331));

	}

}

class Solution30 {
	public int solution(int num) {
		int i = 0;
		int answer = 0;

		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else if (num % 2 == 1) {
				num = num * 3 + 1;
			}
			answer++;

			if (i > 500) {
				answer = -1;
				break;
			}
			i++;
		}
		return answer;
	}
}