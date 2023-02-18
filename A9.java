package Algo;
// 가운데 글자 가져오기
public class A9 {

	public static void main(String[] args) {

		Solution9 sol = new Solution9();
		System.out.println(sol.solution("qwerasdf"));
	}

}

class Solution9 {
	public String solution(String s) {
		String answer = "";

		if (s.length() % 2 == 0) {
			answer += s.charAt(s.length() / 2 - 1) + "";
			answer += s.charAt(s.length() / 2) + "";
		} else {
			answer += s.charAt(s.length() / 2) + "";
		}

		return answer;
	}
}