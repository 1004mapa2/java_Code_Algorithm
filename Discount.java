package codingtest;

public class Discount {

	public static void main(String[] args) {

		Solution2 sol = new Solution2();
		System.out.println(sol.solution(15000));
	}

}

class Solution2 {
	public int solution(int price) {
		int answer = 0;
		if (price >= 100000 && price < 300000) {
			answer = (int) (price * 0.95);
		} else if (price >= 300000 && price < 500000) {
			answer = (int) (price * 0.9);
		} else if (price >= 500000 && price <= 1000000) {
			answer = (int) (price * 0.8);
		} else {
			answer = price;
		}
		return answer;
	}
}