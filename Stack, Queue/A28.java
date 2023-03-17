import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
// 기능개발
public class A28 {
    public int[] solution(int[] progresses, int[] speeds) {
        int countFront = 0;
        int countBack = 0;
        int finalcount = 0;
        ArrayList<Integer> countArr = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) { // queue에 progresses 요소 넣기
            queue.add(progresses[i]);
        }
        int first = queue.peek();
        int speedscount = 0;

        while (true) {
            first += speeds[speedscount];
            countBack++;
            if (first >= 100) {
                queue.poll();
                if (!(queue.isEmpty())) {
                    first = queue.peek();
                }
                if(countFront == 0){
                    countFront = countBack;
                }

                if (countFront >= countBack) {
                    finalcount++;
                    countBack = 0;
                } else {
                    countFront = countBack;
                    countArr.add(finalcount);
                    countBack = 0;
                    finalcount = 1;
                }
                speedscount++;
            }
            if (queue.isEmpty()) {
                countArr.add(finalcount);
                break;
            }
        }
        int[] answer = new int[countArr.size()];
        for(int i = 0; i < countArr.size(); i++){
            answer[i] = countArr.get(i).intValue();
        }
        return answer;
    }

    public static void main(String[] args) {

        A28 a28 = new A28();
        System.out.println(Arrays.toString(a28.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));

    }

}