package testify;

public class Parent {
    String color = "blue";

//    public void sayHello() {
//        String greeting = "hello";
//        System.out.println(greeting);
//    }
//
//    public int sayHello() {
//       return 1;
//    }

    public int plusMethod(int x, int y) {
        return x + y;
    }

    public double plusMethod(double x, double y) {
        return x + y;
    }
    public void dontSayHello() {
        System.out.println("...");
    }

    private static void thisIsPrivacy() {
        System.out.println("private!");
    }

    private void isThisPrivacy() {
        System.out.println("is this privacy?");
    }
    public void anotherMethod() {
        thisIsPrivacy();
        dontSayHello();
        isThisPrivacy();
    }
}
