import java.util.Arrays;

public class A25 {
    // 행렬의 덧셈
    public static void main(String[] args) {
        Solution25 sol = new Solution25();
        System.out.println(Arrays.deepToString(sol.solution(new int[][]{{1},{2}}, new int[][]{{3},{4}})));
    }
}
class Solution25 {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}