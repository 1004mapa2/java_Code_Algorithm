package codingtest;

public class Rock_Scissors_Paper {

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		System.out.println(sol.solution("205"));
		Solution1313 sol1 = new Solution1313();
		System.out.println(sol1.solution("205"));

	}

}

class Solution13 {
	public String solution(String rsp) {
		String answer = "";
		for (int i = 0; i < rsp.length(); i++) {
			if (rsp.charAt(i) == '2') {
				answer += "0";
			} else if (rsp.charAt(i) == '0') {
				answer += "5";
			} else if (rsp.charAt(i) == '5') {
				answer += "2";
			}
		}

		return answer;
	}
}

class Solution1313 {
	public String solution(String rsp) {
		String answer = "";
		String[] arr = rsp.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("2")) {
				answer += "0";
			} else if (arr[i].equals("0")) {
				answer += "5";
			} else if (arr[i].equals("5")) {
				answer += "2";
			}
		}

		return answer;
	}
}