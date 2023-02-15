package codingtest;

public class StringinString {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(sol.solution("abcdefg", "cde"));

	}

}

class Solution4 {
	public int solution(String str1, String str2) {
		int answer = 2;

		if (str1.contains(str2)) {
			answer = 1;
		}

		return answer;
	}
}