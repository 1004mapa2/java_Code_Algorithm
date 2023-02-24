public class A22 {
    // 부족한 금액 계산하기
    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        System.out.println(sol.solution(3, 35, 4));
    }
}

class Solution22 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
        if(money < sum){
            answer = sum - money;
        }

        return answer;
    }
}