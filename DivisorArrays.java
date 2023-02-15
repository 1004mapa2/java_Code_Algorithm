package codingtest;

import java.util.Arrays;

public class DivisorArrays {

	public static void main(String[] args) {

		int[] a = { 5, 9, 7, 10 };
		Solution33 sol = new Solution33();
		System.out.println(Arrays.toString(sol.solution(a, 5)));
	}

}
class Solution33 {
    public int[] solution(int[] arr, int divisor) {
    	int[] answer = {-1};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		count++;
        	}
        }
        if(count != 0) {
        	answer = new int[count];
        }
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		answer[count - 1] = arr[i];
        		count--;
        	}
        	if(count == 0) {
        		break;
        	}
        }
        Arrays.sort(answer);
        
        return answer;
    }
}