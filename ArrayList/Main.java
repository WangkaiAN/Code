package ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        list.add("hello");
        list.add("world");
        System.out.println(list);
        list.add(1,"java");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        list.add("python");
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2,"world");
        System.out.println(list);
        System.out.println(list.contains("java"));

        System.out.println(list.indexof("java"));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
