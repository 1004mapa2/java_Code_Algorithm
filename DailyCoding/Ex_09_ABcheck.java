public class Ex_09_ABcheck {
    public boolean ABCheck(String str) {
        // TODO:
        Boolean answer = false;
        String str1 = str.toLowerCase();

        for (int i = 4; i < str1.length(); i++) {
            if((str1.charAt(i - 4) == 'a' && str1.charAt(i) == 'b') || (str1.charAt(i - 4) == 'b' && str1.charAt(i) == 'a')){
                answer = true;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Ex_09_ABcheck ex09ABcheck = new Ex_09_ABcheck();
        System.out.println(ex09ABcheck.ABCheck("aaaaaccccbbbbb"));
    }
}
