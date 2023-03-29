public class Ex_10_insertDash {
    public String insertDash(String str) {
        //TODO
        String answer = "";

        if (str.length() == 0) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                answer += str.charAt(i);
                break;
            }
            answer += str.charAt(i);
            if ((str.charAt(i) - '0') % 2 != 0) {
                if ((str.charAt(i + 1) - '0') % 2 != 0) {
                    answer += "-";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex_10_insertDash ex10InsertDash = new Ex_10_insertDash();
        System.out.println(ex10InsertDash.insertDash("454793"));

    }
}
