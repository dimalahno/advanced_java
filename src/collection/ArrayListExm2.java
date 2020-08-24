package collection;

import java.util.ArrayList;

public class ArrayListExm2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(200);
        arrayList.add("Dima");
        arrayList.add("Razida");
        arrayList.add("Polina");
        arrayList.add("Ilya");
        arrayList.add(1, "Nasty");
//        arrayList.add(6, "Nasty");
        for(String s: arrayList) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(arrayList.get(2));
        arrayList.set(1,"Masha");

        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
