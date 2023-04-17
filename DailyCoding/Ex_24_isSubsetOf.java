/**
 * sample 배열이 base 배열의 부분집합인지 확인
 * base 요소를 순회하며 sample의 요소와 같으면 count를 늘려서 count의 수와 sample의 길이가 같으면 true를 반환
 */
public class Ex_24_isSubsetOf {
    public boolean isSubsetOf(int[] base, int[] sample) {
        boolean answer = true;
        int count = 0;

        for(int i = 0; i < sample.length; i++) {
            for(int j = 0; j < base.length; j++) {
                if(sample[i] == base[j]) {
                    count++;
                }
            }
        }
        if(count != sample.length){
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex_24_isSubsetOf ex24IsSubsetOf = new Ex_24_isSubsetOf();
        System.out.println(ex24IsSubsetOf.isSubsetOf(new int[]{1, 2, 3, 4, 5}, new int[]{1, 6}));
    }
}
