package HomeWork;

import java.util.Arrays;
//class X{
//    public int i=0;
//    public X(){
//        System.out.print("X");
//    }
//}
//class Y extends X{
//    public int j=0;
//    public Y(){
//        System.out.print("Y");
//    }
//}
public class day04 {
    day04 d=new day04();
    public day04(){
        System.out.print("Z");
    }

    public static void main(String[] args) {
        day04 d=new day04();
    }

    //合并两个有序数组
//    public static void main(String[] args) {
//      int[] ar={2,0};
//      int[] br={1};
//      System.out.println(br.length);
//      System.out.println(Arrays.toString(ar));
//      merge(ar,ar.length-br.length,br,br.length);
//      System.out.println(Arrays.toString(ar));
//    }
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int count=0;
//        for (int i=m;i<nums1.length&&count<=n-1;++i){
//            nums1[i]=nums2[count];
//            count++;
//        }
//        for(int i=0;i<nums1.length-1;++i){
//            for(int j=0;j<nums1.length-i-1;++j){
//                if(nums1[j]>nums1[j+1]){
//                    int temp=nums1[j];
//                    nums1[j]=nums1[j+1];
//                    nums1[j+1]=temp;
//                }
//            }
//        }
//    }

    // 最后一个单词的长度
//    public static void main(String[] args) {
//        String s1="hell world";
//        System.out.println(lengthOfLastWord(s1));
//    }
//    public static int lengthOfLastWord(String s) {
//        int count=0,n=s.length();
//        while(n>=1&&s.charAt(n-1)==' '){
//            n--;
//        }
//        for(int i=0;i<n;i++){
//            if (s.charAt(i)!=' ')
//                count++;
//            if(s.charAt(i)==' ')
//                count=0;
//        }
//        return count;

//        char[] ch=s.toCharArray();
//        int count=0,n=ch.length;
//        while(n>=1&&ch[n-1]==' '){
//            n--;
//        }
//        for(int i=0;i<n;i++){
//            if (ch[i]!=' ')
//                count++;
//            if(ch[i]==' ')
//                count=0;
//        }
//        return count;
//    }

//    public static void main(String[] args) {//2
//        System.out.println("value="+switchit(4));//3
//    }//4
//    public static int switchit(int x) {
//        int j=1;
//        switch (x) {
//            case 1:j++;
//            case 2:j++;
//            case 3:j++;
//            case 4:j++;
//            case 5:j++;
//            default:j++;
//        }
//        return j+x;
//    }
}
