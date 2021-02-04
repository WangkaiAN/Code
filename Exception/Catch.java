package Exception;

import java.util.Scanner;

public class Catch {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }
    public static int divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("抛出除 0 异常");
        }
        return x / y;
    }


//    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in)) {
//            int num = scanner.nextInt();
//            System.out.println("num" + num);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("回收资源");
//        }
//        System.out.println("主程序结束");
//    }

//    public static void main(String[] args) {
//        int[] ar={1,2,3,4,5};
//        try{
//            func(ar);
//        }catch(ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("完成");
//        }
//        System.out.println("主程序结束");
//    }
//    public static void func(int[] ar){
//        System.out.println(ar[ar.length]);
//    }
}
