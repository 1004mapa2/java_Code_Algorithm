package codingtest;

public class IntegerSum {

	public static void main(String[] args) {
		
		Solution28 sol = new Solution28();
		System.out.println(sol.solution(5, 3));
	}

}
class Solution28 {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a > b) {
        	int tmp = a;
        	a = b;
        	b = tmp;
        }
        for(int i = a; i <= b; i++) {
        	answer += i;
        }
        return answer;
    }
}