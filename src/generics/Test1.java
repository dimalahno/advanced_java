package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
//        List list = new ArrayList(); //rotype - сырой тип
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
        list.add("hkjsdlj");
        list.add("kj;lkl;l");
        list.add("xzvcv");
        list.add("l;'kl;k;'");


        for (Object o: list){
            System.out.println(o + " length " + ((String)o).length());
        }
    }
}


