package main.java.com.apiats21;

import java.util.concurrent.Semaphore;

public  class Foo {
    static Semaphore semFirst = new Semaphore(1);
    static Semaphore semSecond = new Semaphore(0);
    static Semaphore semThird = new Semaphore(0);

    public void first() {
        try {
            semFirst.acquire();
            System.out.print("first");
        } catch (InterruptedException e) { e.printStackTrace(); }
        semSecond.release();
    }

    public void second() {
        try {
            semSecond.acquire();
            System.out.print("second");
        } catch (InterruptedException e) { e.printStackTrace(); }
        semThird.release();
    }

    public void third() {
        try {
            semThird.acquire();
            System.out.print("third");
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
