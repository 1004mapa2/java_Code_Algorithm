package codingtest;

public class IndexChange {

	public static void main(String[] args) {
		String a = "i love you";
		Solution25 sol = new Solution25();
		System.out.println(sol.solution(a, 3, 6));
		
	}

}
class Solution25 {
    public String solution(String my_string, int num1, int num2) {
        
        char[] CharArr = my_string.toCharArray();
        char tmp = CharArr[num1];
        CharArr[num1] = CharArr[num2];
        CharArr[num2] = tmp;
        String answer = String.valueOf(CharArr);        
        return answer;
    }
}