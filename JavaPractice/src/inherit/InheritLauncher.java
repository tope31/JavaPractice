package inherit;


public class InheritLauncher {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();
        child.showColor();

        child.setEyeColor("red");


    }
}
