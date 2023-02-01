package op;

public class OpTestDrive {


   public static void servant() {
        Op op = new Op();
        op.showName("pangalan ko");
    }
    public static int takeTwo(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
//        System.out.println(takeTwo(1,2));
        servant();
        takeTwo(5, 10);
    }
}
