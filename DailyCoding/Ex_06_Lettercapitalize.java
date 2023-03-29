public class Ex_06_Lettercapitalize {
    public String letterCapitalize(String str) {
        // TODO:
        if (str.length() == 0) {
            return str;
        }
        int num = 0;
        String answer = "";
        if(str.charAt(0) + 3 >= 100){
            answer += (char) (str.charAt(0) - 32);
        }
        else{
            answer += str.charAt(0);
        }

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && str.charAt(i + 1) != ' '){
                num += 32;
                answer += ' ';
            }
            else {
                if(str.charAt(i) + 3 >= 100){
                    answer += (char) (str.charAt(i) - num);
                    num = 0;
                }
                else if(str.charAt(i) + 3 <= 100){
                    answer += str.charAt(i);
                    num = 0;
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Ex_06_Lettercapitalize ex06Lettercapitalize = new Ex_06_Lettercapitalize();
        System.out.println(ex06Lettercapitalize.letterCapitalize("java  is good"));
    }
}
