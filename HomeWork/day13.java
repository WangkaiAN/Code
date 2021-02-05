package HomeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day13 {
    //矩阵中的最长递增路径
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {9,9,4},
                {6,6,4},
                {2,1,1}
        };
        System.out.println(longestIncreasingPath(arr));
    }
    public static int longestIncreasingPath(int[][] matrix) {
        int count=0;
        int col=matrix.length;//行数
        int row=matrix[0].length;//列数
        return 0;
    }
//    public static void main(String[] args) {
//        int[] ar={1,2,3};
//        System.out.println(subsets(ar));
//    }
//
//
//    public static List<List<Integer>> subsets(int[] nums) {
//
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> t = new ArrayList<>();
//        int n = nums.length;
//        for (int mask = 0; mask < (1 << n); ++mask) {
//            t.clear();
//            for (int i = 0; i < n; ++i) {
//                if ((mask & (1 << i)) != 0) {
//                    t.add(nums[i]);
//                }
//            }
//            ans.add(new ArrayList<>(t));
//        }
//        return ans;
//    }

//    public static void main(String[] args) {
//        int[] ar={10,-10,10,-10,10,-10,10,-10};
//        System.out.println(canThreePartsEqualSum(ar));
//    }
//    public static boolean canThreePartsEqualSum(int[] arr) {
//        int n=0;
//        for(int i=0;i<arr.length;++i){
//            n+=arr[i];
//        }
//        n=n/3;
//        int num=0,count=0;
//        for (int j=0;j<arr.length;++j){
//            num+=arr[j];
//            if(num==n){
//                count++;
//                num=0;
//                continue;
//            }
//        }
//        if(count>=3)
//            return true;
//        return false;
//    }
}
