/**
 * (문자열에 나온 숫자 / 공백,숫자를 뺀 문자열의 길이)를 반올림해서 반환
 */
public class Ex_17_numberSearch {
    public int numberSearch(String str) {

        int numleng = 0;
        int strleng = 0;
        String str1 = "";

        str1 = str.replaceAll(" ", "");

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) - '0' >= 0 && str1.charAt(i) - '0' <= 9) {
                numleng += (str1.charAt(i) - '0');
            }
            else {
                strleng++;
            }
        }

        return (int)Math.round((double)numleng / strleng);
    }

    public static void main(String[] args) {
        Ex_17_numberSearch ex17NumberSearch = new Ex_17_numberSearch();
        System.out.println(ex17NumberSearch.numberSearch("Hello6 9World 2, Nic8e D7ay!"));
    }
}
