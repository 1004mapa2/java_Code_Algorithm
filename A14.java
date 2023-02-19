public class A14 {

    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        System.out.println(sol.solution("12sas2as1s3"));
        Solution14$ sol1 = new Solution14$();
        System.out.println(sol1.solution("12sas2as1s3"));
    }
}

class Solution14 {
    public int solution(String my_string) {
        int answer = 0;
        String a = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(!((my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') || (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z'))) {

                a += (my_string.charAt(i) + "");

            } // end if
            else {
                if(a != "") {
                    answer += Integer.parseInt(a);
                    a = "";
                } // End if
            } // End else
        } // End for
        if(a != "")
            answer += Integer.parseInt(a);

        return answer;
    } // End public
} // End class

class Solution14$ {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}