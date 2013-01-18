package de.datazoo.functional;

public class Start {

    private String invokeCallback(F<String, String> f) {
      return f.apply("Hello!");
    }

    public static void main(String[] args) {
        Start start = new Start();
        String result = start.getResult();

        System.out.println("Applied function to String");
        System.out.println("=> " + result);

    }

    private String getResult() {
        return invokeCallback(new F<String, String>() {
            @Override
            public String apply(String s) {
                return "I said: \"" + s + "\"";
            }
        });
    }

}
