import java.util.Arrays;

public class Ex_11_removeExtremes {
    public String[] removeExtremes(String[] arr) {
        // TODO:

        if (arr.length == 0) {
            return null;
        }

        int shortleng = 20;
        int longleng = 0;
        String shorta = "";
        String longb = "";
        String[] answer = new String[arr.length - 2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= shortleng) {
                shorta = arr[i];
                shortleng = arr[i].length();
            }

            if (arr[i].length() >= longleng) {
                longb = arr[i];
                longleng = arr[i].length();
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].equals(shorta) || arr[i].equals(longb))) {
                answer[index] = arr[i];
                index++;

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex_11_removeExtremes ex11RemoveExtremes = new Ex_11_removeExtremes();
        System.out.println(Arrays.toString(ex11RemoveExtremes.removeExtremes(new String[]{"a", "b", "c", "def"})));
    }
}
