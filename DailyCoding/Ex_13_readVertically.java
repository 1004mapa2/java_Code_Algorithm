public class Ex_13_readVertically {
    public String readVertically(String[] arr) {
        String answer = "";

        int maxlength = 0;

        for(int k = 0; k < arr.length; k++) {
            if(arr[k].length() > maxlength){
                maxlength = arr[k].length();
            }
        }
        System.out.println(maxlength);

        int i = 0;
        while (true) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].length() > i){
                    answer += arr[j].charAt(i);
                }
            }
            if(i == maxlength - 1){
                break;
            }
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex_13_readVertically ex13ReadVertically = new Ex_13_readVertically();
        System.out.println(ex13ReadVertically.readVertically(new String[]{"hi", "hello"}));
    }
}
