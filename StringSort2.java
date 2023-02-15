package codingtest;

import java.util.Arrays;

public class StringSort2 {

	public static void main(String[] args) {

		Solution31 sol = new Solution31();
		System.out.println(sol.solution("Bcad"));
	}

}
class Solution31 {
    public String solution(String my_string) {
        char[] chArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(chArr);
        String answer = new String(chArr);
        return answer;
    }
}