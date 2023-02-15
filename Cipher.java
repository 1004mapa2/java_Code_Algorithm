package codingtest;

public class Cipher {

	public static void main(String[] args) {
		
		String a = "pfqallllabwaoclk";
		Solution10 sol = new Solution10();
		System.out.println(sol.solution(a, 2));
		
	}

}
class Solution10 {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i = code - 1; i < cipher.length(); i = i + code) {
        	answer += cipher.charAt(i);
        }
        
        return answer;
    }
}