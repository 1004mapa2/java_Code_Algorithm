public class A19 {
    // 공던지기
    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        System.out.println(sol.solution(new int[]{1,2,3,4,5,6}, 5));
        Solution19$ sol1 = new Solution19$();
        System.out.println(sol1.solution(new int[]{1,2,3,4,5,6}, 5));
    }
}

class Solution19 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int a = 2 * k - 2;

        if (k == 1) {
            return numbers[0];
        }
        if (a >= numbers.length) {
            while (!(a < numbers.length)) {
                a = a % numbers.length;
            }
            answer = numbers[a];
        } else {
            answer = numbers[a];
        }

        return answer;
    }
}
class Solution19$ {
    public int solution(int[] numbers, int k) {
        return numbers[((k - 1) * 2) % numbers.length];
    }
}