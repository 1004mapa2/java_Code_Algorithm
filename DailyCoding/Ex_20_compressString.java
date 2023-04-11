/**
 * 문자가 3개이상 연속되면 나온 횟수 + 문자 출력, 3개 이하면 문자만 연속으로 출력
 */
public class Ex_20_compressString {
    public String compressString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String answer = "";
        char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                count++;
            }// End if
            else {
                if (count >= 3) {
                    answer += String.valueOf(count) + ch;
                }// End if
                else {
                    for (int j = 0; j < count; j++) {
                        answer += ch;
                    }// End for
                }// End else
                ch = str.charAt(i);
                count = 1;
            }// End else
        }// End for
        if (count >= 3) {
            answer += String.valueOf(count) + ch;
        }// End if
        else {
            for (int j = 0; j < count; j++) {
                answer += ch;
            }// End for
        }// End else

        return answer;
    }

    public static void main(String[] args) {
        Ex_20_compressString ex20CompressString = new Ex_20_compressString();
        System.out.println(ex20CompressString.compressString("abc"));
    }
}
