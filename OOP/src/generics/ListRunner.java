package generics;

public class ListRunner {
    public static void main(String[] args) {
        List<String> list = new List<>(5);
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
//        System.out.println(list.get(1));
//        System.out.println(list.getSize());
        for (String str : list) {
            System.out.println(str);
        }
    }
}
