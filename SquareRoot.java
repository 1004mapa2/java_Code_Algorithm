package codingtest;

public class SquareRoot {

	public static void main(String[] args) {
		Solution21 sol = new Solution21();
		System.out.println(sol.solution(121));
		Solution2121 sol1 = new Solution2121();
		System.out.println(sol1.solution(121));
	}

}
class Solution21 {
    public long solution(long n) {
        long answer = 0;
        
        if(Math.ceil(Math.sqrt(n)) != Math.sqrt(n)) {
        	return -1;
        }
        else
        	answer = (long)((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        
        return answer;
    }
}
class Solution2121 {
	  public long solution(long n) {
	      if (Math.pow((int)Math.sqrt(n), 2) == n) { // (int)로 형변환을 해서 소숫점 아래를 날려버리고 제곱한다.
	            return (long) Math.pow(Math.sqrt(n) + 1, 2);
	        }

	        return -1;
	  }
	}