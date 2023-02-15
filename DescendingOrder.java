package codingtest;

public class DescendingOrder {

	public static void main(String[] args) {

		Solution36 sol = new Solution36();
		System.out.println(sol.solution(1234567890));
	}

}

class Solution36 {
	public long solution(long n) {
		String a = n + "";
		char[] chArr = a.toCharArray();

		for (int i = 0; i < a.length(); i++) {
			for (int j = a.length() - 1; j > i; j--) {
				if (chArr[j] > chArr[j - 1]) {
					char tmp = chArr[j];
					chArr[j] = chArr[j - 1];
					chArr[j - 1] = tmp;
				}
			}
		}
		return Long.parseLong(new String(chArr));
	}
}