package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class day12 {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }

    public static int Factorial(int i) {
        if(i==1){
            return 1;
        }
        return i*Factorial(i-1);
    }

    //递归求 1 + 2 + 3 + ... + 10
//    public static void main(String[] args) {
//        System.out.println(Sum(10));
//    }
//
//    public static int Sum(int i) {
//        if(i==0){
//            return 0;
//        }
//        return i+Sum(i-1);
//    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
//    public static void main(String[] args) {
//        System.out.println(AddNum(70));
//    }
//
//    public static int AddNum(int i) {
//        if(i<10){
//            return i;
//        }
//        return (i%10)+AddNum(i/10);
//    }

    //递归求斐波那契数列的第 N 项 1 1 2 3 5 8
//    public static void main(String[] args) {
//        System.out.println(Fiponachi(6));
//    }
//
//    public static int Fiponachi(int i) {
//        if(i<=2){
//            return 1;
//        }
//        return Fiponachi(i-1)+Fiponachi(i-2);
//    }

    //逆波兰表达式求值
//    public static void main(String[] args) {
//        String[] strings={"3","-4","+"};
//        System.out.println(evalRPN(strings));
//    }
//    public static int num(String s1){
//        int n=0;
//        char[] chars=s1.toCharArray();
//        if(chars[0]=='-'){
//            for (int i=1;i<chars.length;++i){
//                n=n*10+(chars[i]-'0');
//            }
//            return -n;
//        }
//        for (int i=0;i<chars.length;++i){
//            n=n*10+(chars[i]-'0');
//        }
//        return n;
//    }
//    public static int evalRPN(String[] tokens) {
//        ArrayList<String> list=new ArrayList<>();
//        if(tokens.length<=1){
//            return num(tokens[0]);
//        }
//        list.add(tokens[0]);
//        list.add(tokens[1]);
//        int n=0;
//        for (int i=2;i<tokens.length;++i){
//            if(tokens[i].charAt(0)<'0'&&tokens[i].length()==1){
//                if (tokens[i].charAt(0)=='+') {
//                    n=num(list.get(list.size()-2))+num(list.get(list.size()-1));
//                    list.remove(list.size()-1);
//                    list.remove(list.size()-1);
//                    list.add(String.valueOf(n));
//                }
//                if (tokens[i].charAt(0)=='-') {
//                    n=num(list.get(list.size()-2))-num(list.get(list.size()-1));
//                    list.remove(list.size()-1);
//                    list.remove(list.size()-1);
//                    list.add(String.valueOf(n));
//                }
//                if (tokens[i].charAt(0)=='*') {
//                    n=num(list.get(list.size()-2))*num(list.get(list.size()-1));
//                    list.remove(list.size()-1);
//                    list.remove(list.size()-1);
//                    list.add(String.valueOf(n));
//                }
//                if (tokens[i].charAt(0)=='/') {
//                    n=num(list.get(list.size()-2))/num(list.get(list.size()-1));
//                    list.remove(list.size()-1);
//                    list.remove(list.size()-1);
//                    list.add(String.valueOf(n));
//                }
//            }else
//                list.add(tokens[i]);
//        }
//        return num(list.get(list.size()-1));
//    }
//    public static void main(String[] args) {
//        int[] ar={1,2,3,3,3};
//        System.out.println(findUnsortedSubarray(ar));
//    }
//    public static int findUnsortedSubarray(int[] nums) {
//        int start=0,end=nums.length-1;
//        int[] ar=nums.clone();
//        Arrays.sort(ar);
//        while (start<end){
//            if(ar[start]==nums[start]){
//                start++;
//            }if(ar[end]==nums[end]){
//                end--;
//            }if(ar[start]!=nums[start]&&ar[end]!=nums[end]){
//                break;
//            }
//        }
//        if(start==end)
//            return end-start;
//        return end-start+1;
//    }
}
