package Test0220;

import java.util.Arrays;

public class huiwen {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6};
        System.out.println(Arrays.toString(solve(6,2,ar)));
    }
    public static int[] solve (int n, int m, int[] a) {
        // write code here
        while(m>0){
            int num=a[a.length-1];
            for(int i=a.length-2;i>=0;i--){
                a[i+1]=a[i];
            }
            a[0]=num;
            m--;
        }
        return a;
    }
}
