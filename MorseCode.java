package codingtest;

public class MorseCode {

	public static void main(String[] args) {

		Solution39 sol = new Solution39();
		System.out.println(sol.solution(".--. -.-- - .... --- -."));
		Solution3939 sol1 = new Solution3939();
		System.out.println(sol1.solution(".--. -.-- - .... --- -."));
	}

}

class Solution39 {
	public String solution(String letter) {
		String answer = "";
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String[] mos = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		String[] a = letter.split(" ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (a[i].equals(mos[j])) {
					answer += alphabet[j];
					break;
				}
			}
		}
		return answer;
	}
}

class Solution3939 {
	public String solution(String letter) {
		String answer = "";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String[] word = letter.split(" ");

		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < morse.length; j++) {
				if (word[i].equals(morse[j]))
					answer += (char) (j + 97);
			}
		}

		return answer;
	}
}