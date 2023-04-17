/**
 * 피보나치 수열 구하기
 */
public class Ex_23_fibonacci {
    public int fibonacci(int num) {
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }

        return fibonacci(num - 2) + fibonacci(num - 1);
    }

    public static void main(String[] args) {
        Ex_23_fibonacci ex23Fibonacci = new Ex_23_fibonacci();
        System.out.println(ex23Fibonacci.fibonacci(7));
    }
}
