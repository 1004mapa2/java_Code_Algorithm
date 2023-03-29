public class Ex_03_powerOfTwo {
    public boolean powerOfTwo(long num) {
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO:
        boolean answer = false;
        long a = 2;
        while(true){
            if(a > num){
                break;
            }
            if(a == num){
                answer = true;
                break;
            }
            a *= 2;

        }
        return answer;
    }

    public static void main(String[] args) {
        Ex_03_powerOfTwo ex_03_powerOfTwo = new Ex_03_powerOfTwo();
        System.out.println(ex_03_powerOfTwo.powerOfTwo(562949953421312L));

    }
}