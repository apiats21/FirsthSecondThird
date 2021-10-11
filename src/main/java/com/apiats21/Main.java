package main.java.com.apiats21;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        new Third(foo);
        new Second(foo);
        new First(foo);
    }
}