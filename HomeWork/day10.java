package HomeWork;

import java.util.Arrays;

public class day10 {
    //在排序数组中查找元素的第一个和最后一个位置
    public static void main(String[] args) {
        int[] ar={1,2,3};
        int[] br=searchRange(ar,1);
        System.out.println(Arrays.toString(br));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ar={-1,-1};
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]==target&&nums[j]==target){
                ar[0]=i;
                ar[1]=j;
                break;
            }
            if(nums[i]==target){
                ar[0]=i;
                --j;
                continue;
            }
            if(nums[j]==target){
                ar[1]=j;
                ++i;
                continue;
            }else
            {
                ++i;
                --j;
            }
        }
        return ar;
    }

    //字符串转换整数（atio）
//    public static void main(String[] args) {
//        String s1="0000042a1234";
//        System.out.println(myAtoi(s1));
//    }
//    public static int myAtoi(String s) {
//        double num=0;
//        int flag=1;
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '&&count==0)
//                continue;
//            if(s.charAt(i)=='-'&&count==0){
//                flag=-1;
//                count++;
//                continue;
//            }
//            if(s.charAt(i)=='+'&&count==0){
//                count++;
//                continue;
//            }
//            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
//                count++;
//                num=num*10+(s.charAt(i)-'0');
//                continue;
//            }else
//                break;
//        }
//        if(num>Integer.MAX_VALUE&&flag==-1)
//            return (int)num*flag-1;
//        return (int)num*flag;
//    }
}
