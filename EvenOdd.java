package codingtest;

public class EvenOdd {

	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		System.out.println(sol.solution(3));

	}

}

class Solution14 {
	public String solution(int num) {
		String answer = "";
		
		if(num % 2 == 0) {
			answer += "Even";
		}
		else {
			answer += "Odd";
		}
		
		return answer;
	}
}