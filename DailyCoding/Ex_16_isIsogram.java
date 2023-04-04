// 문자열을 입력받아 중복되는 것이 있으면 False 반환, 없으면 True 반환
public class Ex_16_isIsogram {
    public boolean isIsogram(String str) {
        boolean answer = true;

        if(str.length() == 0){
            return answer;
        }

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))){
                answer = false;
                break;
            }
            else {
                continue;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex_16_isIsogram ex16IsIsogram = new Ex_16_isIsogram();
        System.out.println(ex16IsIsogram.isIsogram("dropOut"));
    }
}
