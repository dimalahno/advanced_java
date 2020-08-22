package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1.toString());
//        String s  = info1.getValue();

        Info<Integer> info2 = new Info<>(15);
        System.out.println(info2.toString());
        Integer i = info2.getValue();

        Info<Double> info21 = new Info<>(15.5);
        System.out.println(info21.toString());


//        Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info3.toString());
    }

//    public void abc (Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abc (Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}


class Info <T extends Number>{ //T extends Number&I1&I2 - имплементим интерфейсы
    private T value; // не может быть статичной!

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

interface I1{}
interface I2{}

//class Parent{
//    public void abc (Info<String> info) {
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent{
//    public void abc (Info<Integer> info) {
//        Integer s = info.getValue();
//    }
//}

class Bus {

}