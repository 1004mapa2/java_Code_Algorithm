import java.util.Arrays;

public class A20 {
    // 소인수분해
    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        System.out.println(Arrays.toString(sol.solution(420)));
    }
}

class Solution20 {
    public int[] solution(int n) {
        int a = n;
        int count = 0;
        for(int i = 2; i <= n; i++){
            if(a % i == 0){
                a = a / i;
                i--;
                count++;
            }
        }
        int[] answer = new int[count];

        count = 0;
        a = n;
        for(int i = 2; i <= n; i++){
            if(a % i == 0){
                a = a / i;
                answer[count] = i;
                i--;
                count++;
            }
        }
        int k = 0;
        for(int i = 0; i < answer.length; i++){
            if(i == 0 || answer[i] != answer[i - 1]){
                answer[k++] = answer[i];
            }
        }


        return Arrays.copyOf(answer, k);
    }
}