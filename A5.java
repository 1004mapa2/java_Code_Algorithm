package Algo;

// 없는 숫자 더하기
public class A5 {

	public static void main(String[] args) {

		int[] a = { 5,8,4,0,6,7,9 };
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(a));
	}

}

class Solution4 {
	public int solution(int[] numbers) {
		int answer = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		
		return 45 - answer;
	}
}