/**
 * 문자열에 입력된 문자 - secret 의 결과값을 반환
 */
public class Ex_19_decryptCaesarCipher {
    public String decryptCaesarCipher(String str, int secret) {

        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                answer += str.charAt(i);
                continue;
            }
            char ch = str.charAt(i);

            for(int j = 0; j < secret; j++) {
                if(ch == 'a'){
                    ch = 'z';
                }
                else{
                    ch = (char)(ch - 1);
                }
            }
            answer += ch;
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex_19_decryptCaesarCipher ex19DecryptCaesarCipher = new Ex_19_decryptCaesarCipher();
        System.out.println(ex19DecryptCaesarCipher.decryptCaesarCipher("nzop delepd dfaazced jzf", 11));
    }
}
