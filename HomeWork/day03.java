package HomeWork;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class day03 {
    //
    public static void main(String[] args) throws UnsupportedEncodingException {
//
        StringBuffer s1=new StringBuffer("hello");
        System.out.println(s1.reverse());
        StringBuffer sb = new StringBuffer("helloworld");
        System.out.println(sb.insert(0, "lala"));

//        char[] ch={'h','e','l','l','o'};
//        String s1= new String(ch);
//        System.out.println(s1);
//        String s2=new String(ch,0,2);
//        System.out.println(s2);
//        System.out.println(s1.charAt(1));
//        char[] chars=s1.toCharArray();

//        byte[] bytes={'w','o','r','l','d'};

//        byte[] by=s1.getBytes();
//        System.out.println(Arrays.toString(by));
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.endsWith(s2));
//        System.out.println(s1.contains(s2));
//        System.out.println(s1.indexOf(s2));
//        System.out.println(s1.lastIndexOf(s2));
//        System.out.println(s1.startsWith(s2));
//        System.out.println(s1.endsWith(s2));

//        s1.replaceAll("he",s2);
//        s1.replaceFirst("he",s2);

//        String[] strings=s1.split(" ");
//        String[] strings1=s1.split(" ",2);
//        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.toString(strings1));
//        s2=s1.substring(2);
//        System.out.println(s2);
//        s2=s1.substring(2,4);
//        System.out.println(s2);

    }

    //判断一个整数是否是回文数。回文数是指正序（从左向右）
    // 和倒序（从右向左）读都是一样的整数。
//    public static void main(String[] args) {
//        System.out.println(isPalindrome(101));
//    }
//    public static boolean isPalindrome(int x) {
//        String string=String.valueOf(x);
////        System.out.println(string);
//        char[] ch=string.toCharArray();
//        for(int i=0;i<ch.length;++i){
//            if(ch[i]!=ch[ch.length-1-i])
//                return false;
//        }
//        return true;

//        if(x<0)
//            return false;
//        int n=0;
//        int x1=x;
//        while (x1!=0){
//            n++;
//            x1=x1/10;
//        }
//        int[] ar=new int[n];
//        for(int j=0;j<ar.length;++j){
//            ar[j]=x%10;
//            x=x/10;
//        }
//        for(int i=0;i<ar.length;++i){
//            if(ar[i]!=ar[ar.length-1-i])
//                return false;
//        }
//        return true;
//    }
    //给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
//    public static void main(String[] args) {
//        System.out.println(canConstruct("fihjjjjei","hjibagacbhadfaefdjaeaebgi"));
//    }
//    public static boolean canConstruct(String ransomNote, String magazine) {
//        char[] chars1 = ransomNote.toCharArray();
//        char[] chars2 = magazine.toCharArray();
//        if (chars1.length > chars2.length) {
//            return false;
//        }//都是小写，就可以写出数组，然后比较//每个杂志中的字母只能用一次
//        int[] rans = new int[26];
//        int[] maga = new int[26];
//        for (char c : chars1) {
//            rans[c - 'a']++;
//        }
//        for (char c : chars2) {
//            maga[c - 'a']++;
//        }
//        for (int i = 0; i < rans.length ; i++) {
//            if (rans[i] > maga[i]) {
//                return false;
//            }
//        }
//        return true;
//    }


//    public static void main(String[] args) {
//        int a=getValue(2);
//        System.out.println(a);
//    }
//    public static int getValue(int i) {
//        int result = 0;
//        switch (i) {
//            case 1:
//                result = result + i;
//            case 2:
//                result = result + i * 2;
//            case 3:
//                result = result + i * 3;
//        }
//        return result;
//    }
//
//    public static void main(String args[]) {
//        int i = 7;
//        do {
//        System.out.println(--i);
//        --i;
//        } while (i != 0);
//        System.out.println(i);
//        }
}
