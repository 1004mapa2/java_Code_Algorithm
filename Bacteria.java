package codingtest;

public class Bacteria {

	public static void main(String[] args) {
		
		Solution8 sol = new Solution8();
		System.out.println(sol.solution(7, 15));
		
	}

}
class Solution8 {
    public int solution(int n, int t) {
        int answer = n;
        
        for(int i = 0; i < t; i++) {
        	answer *= 2;
        }
        
        return answer;
    }
}