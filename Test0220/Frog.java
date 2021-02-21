package Test0220;

public class Frog {
    public static void main(String[] args) {
        System.out.println(JumpFloor(2));
    }
    public static int JumpFloor(int target) {
        if (target == 0 || target == 1) return target;
        int a = 1, b = 1;
        int c=0;
        for (int i=2; i<=target; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
