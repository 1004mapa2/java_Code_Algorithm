public class A15 {
    // 이진수 더하기
    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        System.out.println(sol.solution("10010", "1111"));
        Solution15$ sol1 = new Solution15$();
        System.out.println(sol1.solution("10010", "1111"));


    }
}

class Solution15 {
    public String solution(String bin1, String bin2) {
        String answer = "";

        String samp = "";
        if (bin1.length() != bin2.length()) {
            if (bin1.length() > bin2.length()) {
                for (int i = 0; i < bin1.length() - bin2.length(); i++) {
                    samp += "0";
                }
                bin2 = samp + bin2;
            } else {
                for (int i = 0; i < bin2.length() - bin1.length(); i++) {
                    samp += "0";
                }
                bin1 = samp + bin1;
            }
        }
        int x = 0;
        for (int i = bin1.length() - 1; i >= 0; i--) {
            x += ((bin1.charAt(i) - '0') + (bin2.charAt(i) - '0'));
            if (x == 2) {
                answer += "0";
                x = 1;
            } else if (x == 0) {
                answer += "0";
                x = 0;
            } else if (x == 1) {
                answer += "1";
                x = 0;
            } else if (x == 3) {
                answer += "1";
                x = 1;
            }
        }
        if (x != 0) {
            answer += "1";
        }
        String rev = "";
        for (int i = answer.length() - 1; i >= 0; i--) {
            rev += answer.charAt(i);
        }

        return rev;
    }
}

class Solution15$ {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}