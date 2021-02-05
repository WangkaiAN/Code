package HomeWork;

import java.util.Arrays;

public class day02 {
    //实现方法 compareTo
    public static void main(String[] args) {
        String s1="hello";
        String s2="helo";
        System.out.println(s1.compareTo(s2));
        System.out.println(MycompareTo(s1,s2));
    }

    public static int MycompareTo(String s1, String s2) {
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        int n=ch1.length>ch2.length?ch1.length:ch2.length;
        for(int i=0;i<n;++i){
            if(ch1[i]==ch2[i])
                continue;
            if(ch1[i]!=ch2[i])
                return ch1[i]-ch2[i];
        }
        return 0;
    }

    //实现方法 contains, 能够判定字符串中是否包含子串
//    public static void main(String[] args) {
//        String s1="hello";
//        System.out.println(s1.contains("ea"));
//        System.out.println(Mycontains(s1,"el"));
//        System.out.println(Mycontains(s1,"ea"));
//    }
//
//    public static boolean Mycontains(String s1, String el) {
//        if(s1.indexOf(el)>=0)
//            return true;
//        else
//            return false;
//    }

    //实现方法 indexOf
//    public static void main(String[] args) {
//        String s1="hello";
//        int n=s1.indexOf("lo");
//        System.out.println(n);
//        int n1=MyindexOf(s1,"lo");
//        System.out.println(n1);
//    }
//    public static int MyindexOf(String s1, String el) {
//     char[] ch1=s1.toCharArray();
//     char[] ch2=el.toCharArray();
//     if(ch1.length<ch2.length)
//         return -1;
//     for(int i=0;i<ch1.length;++i){//s1字符串
//         int count=0;
//         for(int j=0;j<ch2.length;++j) {//el字符串
//             if (ch1[i+count] == ch2[j])//匹配上一个进行计数，从零开始
//                 count++;
//            }
//             if(count==ch2.length)
//                 return i;
//         }
//     return -1;
//    }

    //实现方法 replace
//    public static void main(String[] args) {
//        String s1="hello";
//        String s2=s1.replace("he","Ah");
//        System.out.println(s2);
//        String s3=Myreplace(s2,"he","Ah");
//        System.out.println(s3);
//    }
//    public static String Myreplace(String s2, String he, String ah) {
//        StringBuffer stringBuffer=new StringBuffer(s2);
//        if(stringBuffer.indexOf(he)>=0){
//            int start=stringBuffer.indexOf(he);
//            stringBuffer.delete(start,he.length()+1);
//            stringBuffer.insert(start,ah);
//        }
//        String string=stringBuffer.substring(0);
//        return string;
//    }


    //实现方法 split

//    public static void main(String[] args) {
//        String s1="helleo";
//        String[] s2=s1.split("el");
//        String[] s3=MySplit(s1,"el");
//        System.out.println(s1);
//        System.out.println(Arrays.toString(s2));
//        System.out.println(Arrays.toString(s3));
//    }
//    public static String[] MySplit(String s1,String str){
//        int n=0;
//        String[] strings=new String[s1.length()];
//        StringBuffer stringBuffer=new StringBuffer(s1);
//        for (int i=0;i<strings.length-1;++i) {
//            if (stringBuffer.indexOf(str)>=0) {
//                int start=stringBuffer.indexOf(str);
//                stringBuffer.delete(start,str.length()+start);
//                strings[i]=stringBuffer.substring(n,start);
//                strings[i+1]=stringBuffer.substring(start);
//                n=str.length()+start-1;
//                continue;
//            }
//            String[] st1=new String[n];
//            for(int j=0;j<st1.length;++j){
//                    st1[j]=strings[j];
//            }
//            return st1;
//        }
//        return strings;
//    }
//    public static void main(String[] args) {
//        String s1="abc"+"def";//1
//        String s2=new String(s1);//2
//        String s3=s2.substring(1,3);
//        System.out.println(s2);
//        System.out.println(s3);
//        if(s1.equals(s2))//3
//            System.out.println(".equals succeeded");//4
//        if(s1==s2)//5
//            System.out.println("==succeeded");//
//    }

//    public static boolean isAdmin(String userId){
//        System.out.println(userId.toLowerCase());
//        return userId.toLowerCase()=="admin";
//    }
//    public static void main(String[] args){
//        System.out.println(isAdmin("Admin"));
//    }

//    String str = new String("good");
//    char[ ] ch = { 'a' , 'b' , 'c' };
//    public static void main(String args[]){
//        day02 ex = new day02();
//        ex.change(ex.str,ex.ch);
//        System.out.print(ex.str + " and ");
//        System.out.print(ex.ch);
//    }
//    public void change(String str,char ch[ ]){
//        str = "test ok";
//        ch[0] = 'g';
//    }

    //目标值不存在于数组中，返回它将会被按顺序插入的位置。
//    public static void main(String[] args) {
//        int[] ar=new int[]{1,3,5,6};
//        int n=2;
//        int a=searchInsert(ar,n);
//        System.out.println(a);
//    }
//    public static int searchInsert(int[] nums, int target) {
//        int lift=0;
//        int right=nums.length-1;
//        int mid=0;
//        if(nums[right]<target){
//            return right+1;
//        }
//        if(nums[lift]>=target){
//            return lift;
//        }
//        while(lift<right){
//            mid=(lift+right)/2;
//            if(nums[mid]==target){
//                return mid;
//            }
//            if(nums[mid]>target){
//                right=mid;
//            }
//            if(nums[mid]<target){
//                lift=mid+1;
//            }
//        }
//        return lift;
//    }
//    public static void main(String[] args) {
//     int[] nums={0};
//     int val=0;
//     int n=removeElement(nums,val);
//     System.out.println(n);
//    }
//    public static int  removeElement(int[] nums, int val) {
//        int lift=0;
//        int right=nums.length-1;
//        while(lift<right){
//            while(lift<right && nums[lift]!=val){
//                lift++;
//            }
//            while(lift<right && nums[right]==val){
//                right--;
//            }
//            int temp=nums[lift];
//            nums[lift]=nums[right];
//            nums[right]=temp;
//        }
//        if(lift==right && nums[lift]!=val)
//            lift++;
//        return lift;
//    }
}
