package codingtest;

public class DigitPlus {

	public static void main(String[] args) {
		
		Solution16 sol = new Solution16();
		System.out.println(sol.solution(987));
		Solution1616 sol1 = new Solution1616();
		System.out.println(sol1.solution(987));
		
	}

}

class Solution16 {
	public int solution(int n) {
		int answer = 0;
		String a = n + "";
		for(int i = 0; i < a.length(); i++) {
			answer += a.charAt(i) - '0';
		}
		
		return answer;
	}
}

class Solution1616 {
	public int solution(int n) {
		int answer = 0;
		
		while(n != 0) {
			answer += n % 10;
			n /= 10;
		}
		
		
		return answer;
	}
}