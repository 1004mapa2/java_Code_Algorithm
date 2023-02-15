package Algo;

//중복된 문자 제거
public class A1 {

	public static void main(String[] args) {

		String str = "people";
		Solution sol = new Solution();
		System.out.println(sol.solution(str));
		Solution0 sol0 = new Solution0();
		System.out.println(sol0.solution(str));
	}

}

class Solution {
	public String solution(String my_string) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.indexOf(my_string.charAt(i)) == i) {
				answer += my_string.charAt(i);
			}
		}
		return answer;
	}
}
class Solution0 {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}