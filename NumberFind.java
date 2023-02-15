package codingtest;

public class NumberFind {

	public static void main(String[] args) {

		Solution27 sol = new Solution27();
		System.out.println(sol.solution(29183, 3));
		Solution2727 sol1 = new Solution2727();
		System.out.println(sol1.solution(29183, 3));

	}

}

class Solution27 {
	public int solution(int num, int k) {
		int answer = 0;

		String a = num + "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == k + '0') {
				answer++;
				break;
			}
			else if(i == a.length() - 1) {
				answer = -1;
				break;
			}
			answer++;
		}
		return answer;
	}
}

class Solution2727 {
    public int solution(int num, int k) {
        int answer = -1;

        String str = String.valueOf(num);

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == k + '0'){
                answer = i+1;
                break;
            }
        }

        return answer;
    }
}