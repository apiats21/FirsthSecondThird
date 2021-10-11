package main.java.com.apiats21;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Thread t3 = new Thread(foo::third);
        Thread t2 = new Thread(foo::second);
        Thread t1 = new Thread(foo::first);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}

