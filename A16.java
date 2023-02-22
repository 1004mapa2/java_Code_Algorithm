import java.util.Arrays;
public class A16 {
    // 문자열 내림차순으로 배치하기
    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        System.out.println(sol.solution("Zbcdefg"));
    }
}

class Solution16 {
    public String solution(String s) {
        String answer = "";
        char[] a = s.toCharArray();
        Arrays.sort(a);
        for(int i = s.length() - 1; i >= 0; i--){
            answer += a[i];
        }
        return answer;
    }
}