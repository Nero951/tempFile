package thread;


public class SingletonHungry {
    private static final SingletonHungry instance;

    static{
        instance = new SingletonHungry();
    }

    public static SingletonHungry getInstance(){

        return instance;
    }

    private SingletonHungry(){

    }
}
