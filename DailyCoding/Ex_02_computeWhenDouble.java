public class Ex_02_computeWhenDouble {
    public int computeWhenDouble(double interestRate) {
        // TODO:
        double money = 100.0;
        int count = 0;
        double transinter = interestRate / 100;

        while (true) {
            if (money >= 200) {
                break;
            }
            money += money * transinter;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {

        Ex_02_computeWhenDouble ex_02_computeWhenDouble = new Ex_02_computeWhenDouble();
        System.out.println(ex_02_computeWhenDouble.computeWhenDouble(100));

    }
}