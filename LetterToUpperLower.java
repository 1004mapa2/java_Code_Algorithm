package codingtest;

public class LetterToUpperLower {

	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution("AAAaaa"));

	}

}

class Solution12 {
	public String solution(String my_string) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			if (65 <= my_string.charAt(i) && my_string.charAt(i) < 97) {
				answer += (char) (my_string.charAt(i) + 32);
			} else {
				answer += (char) (my_string.charAt(i) - 32);
			}
		}

		return answer;
	}
}