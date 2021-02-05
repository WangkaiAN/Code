package HomeWork;

import java.util.Arrays;
import java.util.Scanner;
public class day01 {
    //给定两个整型数组, 交换两个数组的内容.
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int[] br={6,7,8,9,0};
        System.out.println("ar"+Arrays.toString(ar));
        System.out.println("br"+Arrays.toString(br));
        Sweap(ar,br);
        System.out.println("ar"+Arrays.toString(ar));
        System.out.println("br"+Arrays.toString(br));
    }

    public static void Sweap(int[] ar, int[] br) {
        for(int i=0;i<br.length&&i<ar.length;++i){
            int temp=ar[i];
            ar[i]=br[i];
            br[i]=temp;
        }
    }

    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
//    public static void main(String[] args) {
//        int[] ar={1,2,3,4,5,3};
//        Exchange(ar);
//        System.out.println(Arrays.toString(ar));
//    }
//
//    public static void Exchange(int[] ar) {
//        int lift=0;
//        int right=ar.length-1;
//        while(lift<right){
//            while(lift<right && ar[lift]%2==0){
//                lift++;
//            }
//            while(lift<right && ar[right]%2!=0){
//                right--;
//            }
//            int temp=ar[lift];
//            ar[lift]=ar[right];
//            ar[right]=temp;
//        }
//    }
//class Test {
//    public static void hello() {
//        System.out.println("hello");
//    }
//}
//class Test{
//
//    public String toString() {
//
//        System.out.print("aaa");
//
//        return "bbb";
//
//    }
//
//}
//public class Person{
//
//    private String name = "Person";
//
//    int age=0;
//
//}

//    public static void main(String[] args) {
//
//        System.out.println(new Test());
//    }
//    static int cnt = 6;
//    static{
//        cnt += 9;
//    }
//    public static void main(String[] args){
//        System.out.println("cnt =" + cnt);
//    }
//    static{
//        cnt /=3;
//    };

//    private int count;
//
//    public static void main(String[] args) {
//
//        day01 test=new day01(88);
//
//        System.out.println(test.count);
//
//    }
//
//    day01(int a) {
//
//        count=a;
//
//    }
//    private static int x = 100;// 2
//    public static void main(String args[]) {// 3
//        day01 hsl = new day01();// 4
//        hsl.x++;// 5
//        System.out.println(x);
//        day01 hs2 = new day01();// 6
//        hs2.x++;// 7
//        System.out.println(x);
//        hsl = new day01();// 8
//        hsl.x++;// 9
//        System.out.println(x);
//        day01.x--;// 10
//        System.out.println(" x=" + x);// 11
//    }


//    public String grade;extends Person
//
//    public static void main(String[] args){
//
//        Person p = new day01();
//
//        System.out.println(p.name);
//
//    }




//    private float f=1.0f;
//
//    int m=12;
//
//    static int n=1;
//
//    public static void main(String args[]){
//
//        day01 t=new day01();
//        t.f=1.0;
//        day01.
//    }

//    static boolean Paddy;
//    public static void main(String args[]){
//        System.out.println(Paddy);
//    }

//    public int aMethod(){
//        static int i = 0;
//        i++;
//        return i;
//    }
//    public static void main(String args[]){
//        day01 test = new day01();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }

//    public static void main(String[] args){
//
//        String s;
//
//        System.out.println("s="+s);
//
//    }


//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Test test=null;
//        test.hello();
//    }




//    public static void main(String[] args) {
//        int[] ar={1,2,4,5,6,7};
//        int n=3;
//        rotate(ar,n);
//        System.out.println(Arrays.toString(ar));
//    }
//    public static void rotate(int[] nums, int k) {
//        int k1=k%nums.length;
//        int[] arr=new int[nums.length*2];
//        for(int i=0;i<nums.length;++i){
//            arr[i]=arr[i+nums.length]=nums[i];
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int j=0;j<nums.length;j++){
//            nums[nums.length-1-j]=arr[arr.length-1-k1-j];
//        }
//    }
//        if(k==0)
//            return;
//        int[] arr=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            if(i==nums.length-1){
//                arr[0]=nums[i];
//                continue;
//            }
//            arr[i+1]=nums[i];
//        }
//        k--;
//        if(k>0){
//            rotate(arr,k);
//        }
//        for(int i=0;i<arr.length;++i){
//                nums[i]=arr[i];
//        }

//        int length = nums.length;
//        int temp[] = new int[length];
//        //把原数组值放到一个临时数组中，
//        for (int i = 0; i < length; i++) {
//            temp[i] = nums[i];
//        }
//        //然后在把临时数组的值重新放到原数组，并且往右移动k位
//        for (int i = 0; i < length; i++) {
//            nums[(i + k) % length] = temp[i];
//        }
//    }




//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//
//        String str=new String();
//        str=scanner.next();
//        str=toLowerCase(str);
//        System.out.println(str);
//    }
//    public static String toLowerCase(String str) {
//        char[] string=str.toCharArray();
//        String stri="";
//        for(int i=0;i<str.length();i++){
//            if(string[i]<='Z'&& string[i]>='A'){
//                string[i]+=32;
//            }
//            stri+=string[i]+"";
//        }
//        return stri;
//    }

//    public static void main(String[] args) {
////        int x=20,y=5;
////        System.out.println(x+y +""+(x+y)+y);
//        int n=1234;
//        mystery(n);
//    }
//    public static void mystery(int x){
//        System.out.print(x%10);
//        if((x/10)!=0){
//            mystery(x/10);
//        }
//        System.out.print(x%10);
//    }
}
