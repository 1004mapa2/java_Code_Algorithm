import java.util.Arrays;

public class Ex_12_reverseArr {
    public int[] reverseArr(int[] arr) {
        if (arr.length == 0) {
            return new int[]{};
        }
        int[] a = Arrays.copyOfRange(arr, arr.length - 1, arr.length);

        int[] b = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1));

        int[] result = new int[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
    }

    public static void main(String[] args) {
        Ex_12_reverseArr ex12Reversearr = new Ex_12_reverseArr();
        System.out.println(Arrays.toString(ex12Reversearr.reverseArr(new int[]{1, 2, 3})));
    }
}
