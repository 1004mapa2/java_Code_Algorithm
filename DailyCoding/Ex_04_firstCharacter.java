public class Ex_04_firstCharacter {
    public String firstCharacter(String str) {
        // TODO:

        if(str.length() == 0){
            return "";
        }
        String sum = "";
        sum += str.charAt(0);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                sum += str.charAt(i + 1);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Ex_04_firstCharacter ex04FirstCharacter = new Ex_04_firstCharacter();
        System.out.println(ex04FirstCharacter.firstCharacter("The community at Code States might be the biggest asset"));

    }
}