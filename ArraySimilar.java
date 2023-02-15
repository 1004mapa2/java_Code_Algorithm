package codingtest;

public class ArraySimilar {

	public static void main(String[] args) {

		String[] s1 = { "a", "b", "c" };
		String[] s2 = { "com", "b", "d", "p", "c" };

		Solution1 sol = new Solution1();
		int result = sol.solution(s1, s2);
		System.out.println(result);

	}

}

class Solution1 {
	public int solution(String[] s1, String[] s2) {

		int answer = 0;

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}
			}
		}
		return answer;
	}
}