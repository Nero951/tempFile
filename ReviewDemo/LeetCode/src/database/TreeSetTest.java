package database;


import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new Parent(3));
        set.add(new Child(1));
        set.add(new Parent(4));
        System.out.println(set.size());
    }

}
