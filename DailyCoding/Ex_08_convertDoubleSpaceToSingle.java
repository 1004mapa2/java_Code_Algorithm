public class Ex_08_convertDoubleSpaceToSingle {
    public String convertDoubleSpaceToSingle(String str){

        String x = "";
        x = str.replaceAll("  ", " ");
        return x;
    }

    public static void main(String[] args) {
        Ex_08_convertDoubleSpaceToSingle ex08ConvertDoubleSpaceToSingle = new Ex_08_convertDoubleSpaceToSingle();
        System.out.println(ex08ConvertDoubleSpaceToSingle.convertDoubleSpaceToSingle("string  with  double  spaces"));

    }
}
