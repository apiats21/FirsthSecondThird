package main.java.com.apiats21;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();

        new Thread( () -> { foo.first(); }).start();
        new Thread( () -> { foo.second(); }).start();
        new Thread( () -> { foo.third(); }).start();


    }
}