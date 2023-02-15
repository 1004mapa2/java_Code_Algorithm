package codingtest;

public class Pizza2 {

	public static void main(String[] args) {
		
		Solution37 sol = new Solution37();
		System.out.println(sol.solution(4));
	}

}
class Solution37{
    public int solution(int n) {
        int answer = 1;
        int a = 6;
        while(true) {
        	if(a % n == 0) {
        		break;
        	}
        	else {
        		a += 6;
        		answer++;
        	}
        }
        
        return answer;
    }
}