package codingtest;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisor {

	public static void main(String[] args) {

		Solution26 sol = new Solution26();
		System.out.println(Arrays.toString(sol.solution(29)));
		Solution2626 sol1 = new Solution2626();
		System.out.println(Arrays.toString(sol1.solution(29)));

	}

}

class Solution26 {
	public int[] solution(int n) {		
		int[] answer = new int[2];
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		answer = new int[count];
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer[count - 1] = i;
				count--;
			}
		}
		Arrays.sort(answer);
		
		return answer;
	}
}

class Solution2626 {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> test_list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(n % i == 0) test_list.add(i);
        }
        answer = new int[test_list.size()];
        for(int j = 0; j<test_list.size(); j++){
            answer[j] = test_list.get(j);

        } 
        return answer;
    }
}