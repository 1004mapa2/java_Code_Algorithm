package Algo;

// A로 B 만들기
import java.util.Arrays;

public class A2 {

	public static void main(String[] args) {
		String a = "olleh";
		String b = "hello";
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(a, b));
	}

}

class Solution1 {
    public int solution(String before, String after) {
        int answer = 0;
        char[] a = before.toCharArray();
        Arrays.sort(a);
        char[] b = after.toCharArray();
        Arrays.sort(b);
        if(new String(a).equals(new String(b))) {
        	answer = 1;
        }
        
        
        return answer;
    }
}