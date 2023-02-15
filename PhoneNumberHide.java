package codingtest;

public class PhoneNumberHide {

	public static void main(String[] args) {
		
		Solution34 sol = new Solution34();
		System.out.println(sol.solution("9898"));
		Solution3434 sol1 = new Solution3434();
		System.out.println(sol1.solution("01033334444"));
	}

}
class Solution34 {
    public String solution(String phone_number) {
        String answer = "";

        for(int i = 0; i < phone_number.length() - 4; i++) {
        	answer += "*";
        }
        for(int i = 0; i < 4; i++) {
        	answer += phone_number.charAt(i + phone_number.length() - 4) + "";
        }
        return answer;
    }
}

class Solution3434 {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0; i < phone_number.length() - 4 ; i++) {
        	answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);
        return answer;
    }
}