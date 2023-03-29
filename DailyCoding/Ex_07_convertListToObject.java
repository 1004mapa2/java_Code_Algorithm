import java.util.*;

public class Ex_07_convertListToObject {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {

        HashMap<String, String> hashMap = new LinkedHashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != 0){
                if (arrayList.indexOf(arr[i][0]) == -1) {
                    hashMap.put(arr[i][0], arr[i][1]);
                    arrayList.add(arr[i][0]);
                }
            }
        }
        Set<String> hashKeySet = hashMap.keySet();
        Iterator<String> It = hashKeySet.iterator();

        while (It.hasNext()) {
            String x = It.next();
            String y = hashMap.get(x);
            System.out.println(x + "," + y);
        }
        return hashMap;
    }

    public static void main(String[] args) {
        Ex_07_convertListToObject ex07ConvertListToObject = new Ex_07_convertListToObject();
//        ex07ConvertListToObject.convertListToHashMap(new String[][]{{"some", "like"}, {"first", "second"}, {"mike", "ike"}, {"first", "Fox"}, {"melee", "brawl"}});
        ex07ConvertListToObject.convertListToHashMap(new String[][]{{}});
    }
}
