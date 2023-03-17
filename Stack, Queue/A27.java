import java.util.Arrays;
import java.util.Stack;
// 같은 숫자는 싫어
public class A27 {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(!(stack.peek() == arr[i])){
                stack.push(arr[i]);
            }
        }

        int stSize = stack.size();

        int[] answer = new int[stSize];
        for(int i = 0; i < stSize; i++){
            answer[i] = stack.pop();
        }
        int[] answer1 = new int[stSize];
        for(int i = stSize - 1, j = 0; i >= 0; i--, j++){
            answer1[j] = answer[i];
        }

        return answer1;
    }

    public static void main(String[] args) {
        A27 a27 = new A27();
        int[] output = a27.solution(new int[]{4,4,4,3,3});
        System.out.println(Arrays.toString(output));
    }
}
