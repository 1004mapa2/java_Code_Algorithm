package Algo;
// 수박수박수
public class A10 {

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		System.out.println(sol.solution(3));
	}

}
class Solution10 {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 0; i < n; i++) {
        	if(i % 2 == 0) {
        		answer += "수";
        	}
        	else {
        		answer += "박";
        	}
        }
        
        return answer;
    }
}