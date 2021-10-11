package main.java.com.apiats21;

class Second implements Runnable {
    Foo foo;

    public Second(Foo foo) {
        this.foo = foo;
        new Thread(this).start();
    }
    @Override
    public void run() { foo.second(); }
}