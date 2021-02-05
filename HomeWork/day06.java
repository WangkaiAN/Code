package HomeWork;

import java.util.Arrays;

class day06{
    //仅仅反转字母
    public static void main(String[] args) {
        String string="Aab-cd=";
        String s1=reverseOnlyLetters(string);
        System.out.println(s1);

    }
    public static String reverseOnlyLetters(String S) {
        StringBuffer s=new StringBuffer(S);
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if (Character.isLetter(s.charAt(start))
                    && Character.isLetter(s.charAt(end)))
            {
                char c1=s.charAt(start);
                char c2=s.charAt(end);
                s.replace(start,start+1, String.valueOf(c2));
                s.replace(end,end+1, String.valueOf(c1));
                start++;
                end--;
            }
            if(!Character.isLetter(s.charAt(start)))
                start++;
            if(!Character.isLetter(s.charAt(end)))
                end--;
        }
        String s1=s.toString();
        return s1;
    }

    //给定一个按非递减顺序排序
//    public static void main(String[] args) {
//        int[] ar={-1,0,1,2,3,4};
//        int[] br=sortedSquares(ar);
//        System.out.println(Arrays.toString(br));
//    }
//    public static int[] sortedSquares(int[] nums) {
//        for(int i=0;i<nums.length;++i){
//            nums[i]*=nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//    }

//    public static void main(String[] args) {
//        float a=10;
//        int b= (int) 8846.0;
//        byte c=10;
//        int d=-c;
//        System.out.println(byte.class);
//
//    }
}
// class B {
//    public int Func() {
//        System.out.print("B");
//        return 0;
//    }
//}
//class D extends B {
//    @Override
//    public int Func() {
//        System.out.print("D");
//        return 0;
//    }
//}
//public class day06 {
//    public static void main(String[] args) {
//        B a = new B();
//        B b = new D();
//        a.Func();
//        b.Func();
//    }
//}


//class Base {
//    Base() {
//        System.out.print("Base");
//    }
//}
//
//public class day06 extends Base {
//
//    public static void main( String[] args ) {
//
//        new day06();
//
//        //调用父类无参的构造方法
//
//        new Base();
//
//    }
//
//}
//
//abstract class A{
//    abstract public void func();
//}
//abstract class B extends A{
//}
//class C extends B{
//    @Override
//    public void func() {
//        System.out.println("c");
//    }
//}
//public class day06 {
//    public static void main(String[] args) {
////        A a1=new A();
////        A a2=new B();
//        A a3=new C();
//        a3.func();
//    }
//}
