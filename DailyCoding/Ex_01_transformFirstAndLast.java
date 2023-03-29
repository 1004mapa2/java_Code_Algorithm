import java.util.HashMap;

public class Ex_01_transformFirstAndLast {
    public HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        if (arr.length == 0) {
            return null;
        }

        HashMap<String, String> hm = new HashMap<>();

        hm.put(arr[0], arr[arr.length - 1]);

        return hm;



    }
    public static void main(String[] args) {
        Ex_01_transformFirstAndLast ex_01_transformFirstAndLast = new Ex_01_transformFirstAndLast();
        System.out.println(ex_01_transformFirstAndLast.transformFirstAndLast(new String[]{"aa", "bb", "cc"}));
    }
}