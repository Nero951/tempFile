package thread;

class myThread extends Thread{
    @Override
    public void run() {
        super.run();
    }
}
class myRunnableThread implements Runnable{
    @Override
    public void run() {

    }
}
public class MyThread{
    myThread thread = new myThread();
    myRunnableThread myRunnableThread = new myRunnableThread();
    Runnable runnable = new myThread();

    public static void main(String[] args) {
//        Thread t = new Thread(()->{  //Lambda表达式创建线程方式
//            while(true) System.out.println("我是子线程");
//        });
//
//        t.start();
//        while(true){
//            System.out.println("我是主线程");
//        }
        Thread t = new exThread();
        t.start();

        printFields();

    }
    static class exThread extends Thread{
        @Override
        public void run(){
            printFields();
        }
    }
    private static void printFields(){
        Thread t = Thread.currentThread();
        long id = t.getId();
        System.out.println("线程名称："+id+":"+ t.getName());
        System.out.println("线程优先级："+id+":"+t.getPriority());
        System.out.println("线程是否存活："+id+":"+t.isAlive());
        System.out.println("线程状态："+id+":"+t.getState());
        System.out.println("线程是否是后台线程："+id+":"+t.isDaemon());
    }
}
