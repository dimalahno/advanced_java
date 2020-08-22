package generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("One", 1);
        String v1 = pair.getFirstValue();
        Integer v2 = pair.getSecondValue();
        System.out.println(v1 + " : " + v2);

        OtherPair<String> otherPair = new OtherPair<>("Name", "Surname");
        System.out.println(otherPair.getFirstValue() + " " + otherPair.getSecondValue());
    }
}

class Pair <V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue () {
        return value1;
    }

    public V2 getSecondValue () {
        return value2;
    }
}

class OtherPair <V1> {
    private V1 value1;
    private V1 value2;

    public OtherPair(V1 value1, V1 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue () {
        return value1;
    }

    public V1 getSecondValue () {
        return value2;
    }
}
