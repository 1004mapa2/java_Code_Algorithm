package codingtest;

public class VowelErase {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		System.out.println(sol.solution("nice to meet you"));

	}

}

class Solution7 {
	public String solution(String my_string) {
		String answer = "";
		for(int i = 0; i < my_string.length(); i++) {
			char a = my_string.charAt(i);
			if(!(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')) {
				answer += a + "";
			}
		}
        return answer;
	}
}