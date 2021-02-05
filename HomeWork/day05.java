package HomeWork;

import java.util.Arrays;

public class day05 {


//你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入
//1 次或多次。
//    public static void main(String[] args) {
//        String name="ppyplrza" ;
//        String typed="pyypllrza";
//        System.out.println(isLongPressedName(name,typed));
//    }
//    public static boolean isLongPressedName(String name, String typed) {
//        StringBuffer s2=new StringBuffer(name);
//        StringBuffer s1=new StringBuffer(typed);
//        if(s2.length()>s1.length())
//            return false;
//        char ch=' ';
//        while (s2.length()>0&&s1.length()>0){
//            if(s2.charAt(s2.length()-1)==s1.charAt(s1.length()-1)) {
//                s1.deleteCharAt(s1.length()-1);
//                ch=s2.charAt(s2.length()-1);
//                s2.deleteCharAt(s2.length()-1);
//                continue;
//            }
//            if(ch==s1.charAt(s1.length()-1)){
//                s1.deleteCharAt(s1.length()-1);
//                continue;
//            }
//            return false;
//        }
//        if(s2.length()>0)
//            return false;
//        for(int i=s1.length()-1;i>=0;i--){
//            if(s1.charAt(i)==ch)
//                s1.deleteCharAt(i);
//        }
//        if(s1.length()==0)
//            return true;
//        return false;
//    }

//    public static void main(String[] args) {
//        int[] ar=new int[]{1,2,3,4,1};
//        System.out.println(containsDuplicate(ar));
//    }
//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0;i< nums.length-1;++i){
//            if(nums[i]==nums[i+1])
//                return true;
//        }
//        return false;
//    }

//    private float f = 1.0f;
//    int m = 12;
//    static int n = 1;
//    public static void main (String args[]) {
//        day05 t = new day05();
//
//    }
}
//    String str=new String("hello");
//    char[]ch={'a','b'};
//    public static void main(String args[]){
//        day05 ex=new day05();
//        ex.change(ex.str,ex.ch);
//        System.out.print(ex.str+" and ");
//        System.out.print(ex.ch);
//    }
//    public void change(String str1,char ch[]){
//        str1="test ok";
//        ch[0]='c';
//    }
//}