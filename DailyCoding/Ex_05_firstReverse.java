public class Ex_05_firstReverse {
    public static void main(String[] args) {
        Ex_05_firstReverse ex_05_firstReverse = new Ex_05_firstReverse();
        System.out.println(ex_05_firstReverse.firstReverse("code"));

    }

    public String firstReverse(String str) {
        // TODO:
//        String answer = "";
//        for(int i = str.length() - 1; i >= 0; i--) {
//            answer += str.charAt(i);
//        }
//
//        return answer;

        String answer = "";
        StringBuilder sb = new StringBuilder("code");
        sb.reverse();
//        answer = sb.toString();

        answer = String.valueOf(sb);
        return answer;
    }
}
