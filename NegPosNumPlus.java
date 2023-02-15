package codingtest;

public class NegPosNumPlus {

	public static void main(String[] args) {

		int[] a = { 4, 7, 12 };
		boolean[] b = { true, false, true };
		Solution42 sol = new Solution42();
		System.out.println(sol.solution(a, b));
	}

}

class Solution42 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i] == false) {
				absolutes[i] *= -1;
				answer += absolutes[i];
			}
			else {
				answer += absolutes[i];
			}
		}
		
		return answer;
	}
}
