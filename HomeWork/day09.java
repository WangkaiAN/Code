package HomeWork;

import java.util.Arrays;

public class day09 {
    public static void main(String[] args) {
        int n='0';
        System.out.println(n);
    }

    //二进制求和
//    public static void main(String[] args) {
//        String s1="111";
//        String s2="10";
//        String s3=addBinary(s1,s2);
//        System.out.println(s3);
//    }
//    public static String addBinary(String a, String b) {
//        StringBuffer ans = new StringBuffer();
//        int n = Math.max(a.length(), b.length()), carry = 0;
//        for (int i = 0; i < n; ++i) {
//            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
//            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
//            ans.append((char) (carry % 2 + '0'));
//            carry /= 2;
//        }
//        if (carry > 0) {//进位标志
//            ans.append('1');
//        }
//        ans.reverse();
//        return ans.toString();
//    }

    //两数之和
//    public static void main(String[] args) {
//        int[] ar={3,3};
//        int n=6;
//        int[] br=twoSum(ar,n);
//        System.out.println(Arrays.toString(br));
//    }
//    public static int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length-1;++i){
//            for (int j=nums.length-1;j>i;--j) {
//                if(target-nums[i]==nums[j]){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[0];
//    }
}
