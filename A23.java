public class A23 {
    // 영어가 싫어요
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        System.out.println(sol.solution("onefourzerosixseven"));
        Solution23$ sol1 = new Solution23$();
        System.out.println(sol1.solution("onefourzerosixseven"));
    }
}

class Solution23 {
    public long solution(String numbers) {
        long answer = 0;
        String result = "";
        String a = "";
        for (int i = 0; i < numbers.length(); i++) {
            a += numbers.charAt(i);
            if (a.equals("one")) {
                result += "1";
                a = "";
            } else if (a.equals("two")) {
                result += "2";
                a = "";
            } else if (a.equals("three")) {
                result += "3";
                a = "";
            } else if (a.equals("four")) {
                result += "4";
                a = "";
            } else if (a.equals("five")) {
                result += "5";
                a = "";
            } else if (a.equals("six")) {
                result += "6";
                a = "";
            } else if (a.equals("seven")) {
                result += "7";
                a = "";
            } else if (a.equals("eight")) {
                result += "8";
                a = "";
            } else if (a.equals("nine")) {
                result += "9";
                a = "";
            } else if (a.equals("zero")) {
                result += "0";
                a = "";
            }

        }
        answer = Long.parseLong(result);
        return answer;
    }
}

class Solution23$ {
    public long solution(String numbers) {

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            numbers = numbers.replaceAll(arr[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}