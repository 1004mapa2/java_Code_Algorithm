// 배열의 앞요소들을 모두 더한 값보다 가장 끝요소가 크면 True, 아니면 False를 return
public class Ex_14_superIncreasing {
    public boolean superIncreasing(int[] arr) {
        int sum = 0;
        boolean answer = true;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                if(sum >= arr[i]){
                    answer = false;
                    break;
                }

            } else {
                sum += arr[i];
            }

        } //End for
        return answer;
    }

    public static void main(String[] args) {
        Ex_14_superIncreasing ex14SuperIncreasing = new Ex_14_superIncreasing();
        System.out.println(ex14SuperIncreasing.superIncreasing(new int[]{1, 3, 8, 9}));
    }
}
