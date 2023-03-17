public class A26 {
    //외계어 사전
    public static void main(String[] args) {

        String[] a = {"p", "o", "s"};
        String[] b = {"soo", "eocd", "qixm", "adio", "soo"};
        Solution26 sol = new Solution26();
        System.out.println(sol.solution(a, b));
    }
}

class Solution26 {
    public int solution(String[] spell, String[] dic) {

        int answer = 2;


        for(String dicStr : dic) {

            boolean a = true;
            for(String spellStr : spell) {
                if(dicStr.indexOf(spellStr) == -1) {
                    a = false;
                    break;
                }
            }

            if(a) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}