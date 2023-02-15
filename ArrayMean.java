package codingtest;

public class ArrayMean {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		Solution17 sol = new Solution17();
		System.out.println(sol.solution(a));
	}

}

class Solution17 {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }
        return answer / arr.length;
    }
}