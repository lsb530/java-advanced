package thread.collection.simple.list;

import thread.collection.SimpleList;

public class SimpleListMainV1 {

    public static void main(String[] args) {
        SimpleList list = new BasicList();
        list.add("a");
        list.add("b");
        System.out.println("list = " + list);
    }
}
