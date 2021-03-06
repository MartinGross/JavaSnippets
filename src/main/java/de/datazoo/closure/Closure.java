package de.datazoo.closure;

public class Closure {

    public static void main(String[] args) {

        final String text = "Thanks for testing me.";

        Runnable worker = new Runnable() {
            public void run() {
                System.out.println("Hello, I am a closure! " + text);
            }
        };

        worker.run();

        Closure closure = new Closure();
        closure.runClosure(worker);

    }

    public void runClosure(Runnable closure) {

        closure.run();

    }

}
