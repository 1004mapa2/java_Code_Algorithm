public class Ex_15_modulo {
    public Integer modulo (int num1, int num2) {
        if(num1 == 0){
            return null;
        }
        else if(num2 == 0) {
            return 0;
        }
        Integer a = num1;

        while(true) {
            if(a < num2){
                break;
            }
            a -= num2;
        }

        return a;
    }

    public static void main(String[] args) {
        Ex_15_modulo ex15Modulo = new Ex_15_modulo();
        System.out.println(ex15Modulo.modulo(25, 2));
    }
}
