package Threads;

public class MyThread1 {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
    	System.out.println("The Odd Numbers are:");
        for(int i=0;i<11;i++){
            if(i%2 == 1)
                System.out.println(+i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
    	System.out.println("The Even Numbers are:");
        for(int i=0;i<11;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}
