package thread;


public class SingletonLazy {

    private static SingletonLazy instance = null;

//    public synchronized static SingletonLazy getInstance(){ //加了synchronized保证了线程安全，不加的话不能保证线程安全，
//                                                              // synchronized方法创建的位置，每创建一次都要加一次锁，成本太高
//        if (instance==null){
//            instance = new SingletonLazy();
//        }
//
//        return instance;
//    }

    public static SingletonLazy getInstance(){//更优化的解法

        if (instance==null){
            synchronized (SingletonLazy.class){//instance可能为空，可能不为空
                if (instance==null){
                    instance = new SingletonLazy();
                }else{
                    /**
                     * 抢锁之前instance为空，但是抢的过程中不为空了，
                     * 代表已经被之前抢到锁的线程实例化好了
                     * 就什么都不用做了
                     */
                }
            }
        }
        return instance;
    }

    private SingletonLazy(){
    }
}
