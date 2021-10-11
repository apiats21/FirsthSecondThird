package main.java.com.apiats21;

class Third implements Runnable {
    Foo foo;

    public Third(Foo foo) {
        this.foo = foo;
        new Thread(this).start();
    }
    @Override
    public void run() { foo.third(); }
}