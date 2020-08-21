package comporation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dima");
        list.add("Razida");
        list.add("Ilya");
        list.add("Polina");

        System.out.println(list);
        Collections.sort(list); //natural order - естественный порядок (лексиграфический порядок для String)
        System.out.println(list);
    }
}
