package codingtest;

public class StringFindPY {

	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("PyyP"));
		
	}

}
class Solution23 {
    boolean solution(String s) {
        boolean answer = true;
        String a = s.toUpperCase();
        int p = 0;
        int y = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(a.charAt(i) == 'P') {
        		p++;
        	}
        	else if(a.charAt(i) == 'Y') {
        		y++;
        	}
        }
        if(p != y) {
        	answer = false;
        }

        return answer;
    }
}