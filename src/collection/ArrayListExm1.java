package collection;

import java.util.ArrayList;

public class ArrayListExm1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(200);
        arrayList.add("Dima");
        arrayList.add("Razida");
        arrayList.add("Polina");
        arrayList.add("Ilya");
        System.out.println(arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>(arrayList);

        System.out.println(arrayList == arrayList1); //false
        System.out.println(arrayList.equals(arrayList1)); //true
    }
}
