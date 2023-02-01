package testify;

import javax.swing.*;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter text you want to loop: ");
//        String text = scanner.nextLine();
//        System.out.println("Enter number:");
//        int number = scanner.nextInt();

//        Parent parent = new Parent();
//        Child child = new Child();
//
//        parent.dontSayHello();
//        parent.anotherMethod();
//
//        int addition = child.plusMethod(5,10);
//        System.out.println("Overriden and Override number: " + addition);

        System.out.println("Enter Text from sayHello method: ");
        String hello = scanner.nextLine();
        ForLoops forLoops = new ForLoops();
//        forLoops.loops(number, text);

        System.out.println(forLoops.sayHello(hello));

    }

}
