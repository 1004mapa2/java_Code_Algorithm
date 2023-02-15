package Algo;

// 팩토리얼
public class A3 {

	public static void main(String[] args) {

		Solution2 sol = new Solution2();
		System.out.println(sol.solution(120));
		Solution22 sol1 = new Solution22();
		System.out.println(sol1.solution(3628800));
	}

}

class Solution2 {
	public int solution(int n) {
		int answer = 1;
		for (int i = 1; i < 13; i++) {
			if (answer <= n) {
				answer *= i;
			} else {
				answer = i - 2;
				break;
			}
		}
		return answer;
	}
}

class Solution22 {
	public int solution(int n) {
		int answer = 1;
		int i = 0;
		while (true) {
			if (answer <= n) {
				answer *= i + 1;
				i++;
			} else {
				i--;
				break;
			}
		}
		return i;
	}
}