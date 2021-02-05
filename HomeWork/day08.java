package HomeWork;

import java.util.Arrays;

public class day08 {
    //返回第三大的数
    public static void main(String[] args) {
        int[] ar={1,2,2,5,3,5};
        int n=thirdMax(ar);
        System.out.println(n);
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)
            return nums[nums.length-1];
        int count=0,nub=0;
        int n=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;--i){
            if(nub==2){
                break;
            }
            if(n>nums[i]){
                n=nums[i];
                nub++;
            }
            count++;
        }
        if(nub<2)
            return nums[nums.length-1];
        return nums[nums.length-1-count];
    }


    //加一
//    public static void main(String[] args) {
//        int[] ar={8,9,9};
//        int[] br=plusOne(ar);
////        int n=(int)Math.pow(10,9);
////        System.out.println(n);
//        System.out.println(Arrays.toString(br));
//    }
//    public static int[] plusOne(int[] digits) {
//        if(digits[digits.length-1]!=9) {
//            digits[digits.length - 1]++;
//            return digits;
//        }
//
//        int[] ar=new int[digits.length+1];
//        if(digits.length==1){
//            ar[0]=1;
//            ar[1]=0;
//            return ar;
//        }
//        for(int i=digits.length-1,j=ar.length-1;i>=0;--i,--j){
//            if(digits[i]==9) {
//                ar[j]=digits[i]=0;
//                ar[j-1]=1;
//            }
//            else{
//                digits[i]++;
//                return digits;
//            }
//        }
//        return ar;
//    }

//    public static void main(String[] args) {
//        boolean result=false;
//        if(result)
//        result=true;
//    }
}
