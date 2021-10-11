package main.java.com.apiats21;

class First implements Runnable {
    Foo foo;

    public First(Foo foo) {
        this.foo = foo;
        new Thread(this).start();
    }
    @Override
    public void run() { foo.first(); }
}
