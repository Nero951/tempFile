package thread;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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

    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(()->{  //Lambda表达式创建线程方式
//            while(true) System.out.println("我是子线程");
//        });
//
//        t.start();
//        while(true){
//            System.out.println("我是主线程");
//        }
//        Thread t = new exThread();
//        t.start();
//        printFields();
//
//        while(true){
//            try{
//                System.out.println("挖煤");
//                Thread.sleep(1000);
//                System.out.println("是否停止"+ t.isInterrupted());
//            }catch (InterruptedException e){
//
//            }
//        }

//        B b = new B();
//        b.start();
//        System.out.println("b不停止，我不走");
//        b.join();
//        System.out.println("b停止，我就走");
//        System.out.println(Thread.currentThread());
        Thread t = new subThread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        while (t.isAlive()){
            System.out.println(t.getState());
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println(t.getState());

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

    static class B extends Thread{
        @Override
        public void run(){
            long b = 0;
            for (int i = 0; i<1000_000_000L; i++){
                b+=i;
            }
            System.out.println("B停止运行");
        }
    }

    public static class subThread extends Thread{
        @Override
        public void run(){
            Scanner scan = new Scanner(System.in);
            scan.next();
            System.out.println("子线程即将退出");
        }
    }
}
