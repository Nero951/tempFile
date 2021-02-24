package database;


public class Child extends Parent{
    private int ags;

    public Child(int age) {
        super(3);
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
