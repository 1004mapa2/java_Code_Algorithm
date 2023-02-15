package codingtest;

public class Median {

	public static void main(String[] args) {

		int[] array = {-1, 2, 0, 5, 1};

		Solution sol = new Solution();
		int med = sol.solution(array);
		System.out.println(med);
	}

}

class Solution {
	public int solution(int[] array) {
		int answer = 0;
		
		// 오름차순 정렬
		for(int i = 1; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i; j++) {
				if(array[j] > array[j + 1]) {
					int tmp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		answer = array[array.length / 2];
		return answer;
	}
}