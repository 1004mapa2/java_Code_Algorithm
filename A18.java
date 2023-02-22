import java.util.Arrays;

public class A18 {
    // 7의 개수
    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        System.out.println(sol.solution(new int[]{7, 77, 17}));
    }
}

class Solution18 {
    public int solution(int[] array) {
        int answer = 0;

        String a = Arrays.toString(array).replaceAll("[^0-9]", "");

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '7') {
                answer++;
            }
        }

        return answer;
    }
}