public class A24 {
    // 최댓값과 최솟값
    public static void main(String[] args) {
        Solution24 sol = new Solution24();
        System.out.println(sol.solution("-1 -2 -3 -4"));
    }
}
class Solution24 {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String a = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(Integer.parseInt(a) < min){
                    min = Integer.parseInt(a);
                }
                if(Integer.parseInt(a) > max){
                    max = Integer.parseInt(a);
                }
                a = "";
            }
            else{
                a += s.charAt(i);
                if(i == s.length() - 1){
                    if(Integer.parseInt(a) < min){
                        min = Integer.parseInt(a);
                    }
                    if(Integer.parseInt(a) > max){
                        max = Integer.parseInt(a);
                    }
                }
            }
        }
        answer = answer + min + " " + max;

        return answer;
    }
}