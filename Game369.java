package codingtest;

public class Game369 {

	public static void main(String[] args) {

		Solution29 sol = new Solution29();
		System.out.println(sol.solution(29423));
	}

}
class Solution29 {
    public int solution(int order) {
        int answer = 0;
        String a = order + "";
        for(int i = 0; i < a.length(); i++) {
        	if(a.charAt(i) == '3' || a.charAt(i) == '6' || a.charAt(i) == '9') {
        		answer++;
        	}
        }
        
        return answer;
    }
}