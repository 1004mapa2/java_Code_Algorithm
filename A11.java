package Algo;

// 내적
public class A11 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 4 };
		int[] y = { -3, -1, 0, 2 };
		Solution11 sol = new Solution11();
		System.out.println(sol.solution(x, y));
	}

}

class Solution11 {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		
		for(int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}
		
		return answer;
	}
}