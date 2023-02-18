package Algo;

// k의 개수
public class A8 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		System.out.println(sol.solution(1, 13, 1));
		Solution8$ sol1 = new Solution8$();
		System.out.println(sol1.solution(1, 13, 1));
	}

}

class Solution8 {
	public int solution(int i, int j, int k) {
		int answer = 0;
		char ch = (char) (k + '0');

		for (int a = i; a <= j; a++) {
			String b = a + "";
			for (int x = 0; x < b.length(); x++) {
				if (b.charAt(x) == ch) {
					answer++;
				}
			}
		}

		return answer;
	}
}

class Solution8$ {
	public int solution(int i, int j, int k) {
		int answer = 0;
		for (int n = i; n <= j; n++) {
			int num = n;
			while (num != 0) {
				if (num % 10 == k) {
					answer++;
				}
				num /= 10;
			}
		}
		return answer;
	}
}