package HomeWork;

import java.util.Arrays;

public class day07{
    //寻找数组的中心索引
    public static void main(String[] args) {
       int[] ar={1,7,3,6,5,6};
       int n=pivotIndex(ar);
        System.out.println(n);
    }
    public static int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;++i){
            int lift=0;
            int right=0;
            for (int j=0;j<i;++j){
               lift+=nums[j];
            }
            for(int k=i+1;k<nums.length;++k){
                right+=nums[k];
            }
            if(lift==right)
                return i;
        }
        return -1;
    }
    //按奇偶排序数组
//    public static void main(String[] args) {
//       int[] ar={3,1,5,2,4};
//       int[] br=sortArrayByParity(ar);
//        System.out.println(Arrays.toString(br));
//    }
//    public static int[] sortArrayByParity(int[] A) {
//        int lift=0;
//        int right=A.length-1;
//        while(lift<right){
//            while(A[lift]%2==0&&lift<right){
//                lift++;
//            }
//            while(A[right]%2!=0&&lift<right){
//                right--;
//            }
//            int temp=A[right];
//            A[right]=A[lift];
//            A[lift]=temp;
//        }
//        return A;
//    }

//    public void loop() {
//        int x= 10;
//        while ( x ) {
//            System.out.print("x minus one is " + (x - 1));
//            x -= 1;
//        }
//    }

//}
//public void getCustomerInfo() {
//
//        try {
//
//        // do something that may cause an Exception
//
//        } catch (java.io.FileNotFoundException ex) {
//
//        System.out.print("FileNotFoundException!");
//
//        } catch (java.io.IOException ex) {
//
//        System.out.print("IOException!");
//
//        } catch (java.lang.Exception ex) {
//
//        System.out.print("Exception!");
//
//        }
//
//        }
//    }
//    private static void testMethod(){
//
//        System.out.println("testMethod");
//
//    }
//
//    public static void main(String[] args) {
//
//        ((day07)null).testMethod();
//
//    }
}
