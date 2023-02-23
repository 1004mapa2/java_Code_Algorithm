public class A21 {
    // 문자열 다루기 기본
    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        System.out.println(sol.solution("a234"));
    }
}

class Solution21 {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                    answer = false;
                }
            }
        }
        else{
            answer = false;
        }

        return answer;
    }
}
class Solution21$ {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}