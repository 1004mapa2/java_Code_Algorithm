package codingtest;

public class FindKiminSeoul {

	public static void main(String[] args) {

		String[] a = {"Jane", "Kim"};
		Solution32 sol = new Solution32();
		System.out.println(sol.solution(a));
	}

}
class Solution32 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		answer = "김서방은 " + i + "에 있다";
        		break;
        	}
        }
        
        return answer;
    }
}