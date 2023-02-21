import java.util.Arrays;

public class A12 {

    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        System.out.println(sol.solution("abdc"));
        Solution12$ sol1 = new Solution12$();
        System.out.println(sol1.solution("abdc"));
    }
}
class Solution12 {
    public String solution(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                count++;
            }
        }
        char[] a = new char[count];
        count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                a[count] += s.charAt(i);
                count++;
            }
        }
        Arrays.sort(a);
        String answer = new String(a);
//        String answer = String.valueOf(a);
        return answer;
    }
}

class Solution12$ {
    public String solution(String s) {
        int[] alphabet = new int[26];

        for (int i = 0; i< s.length(); i++) {
            alphabet[s.charAt(i) -  'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == 1) {
                sb.append((char)(i+'a'));
            }
        }

        return sb.toString();
    }
}