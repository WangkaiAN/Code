package HomeWork;

import java.util.Arrays;

public class day11 {
    //压缩字符串
    public static void main(String[] args) {
        char[] ar={'b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(ar));
        System.out.println(Arrays.toString(ar));
    }
    public  static int compress(char[] chars) {
        int num=0,count=0;
        for (int i=0;i<chars.length;){
            char c=chars[i];
            chars[num]=c;
            count=0;
            int j=i;
            while(j<chars.length){
                if(c==chars[j]){
                    count++;
                }else
                    break;
                j++;
            }
            num++;
            if (count>=2&&count<10) {
                chars[num]=(char)(count+'0');
                num++;
            }
            if(count>=10){
                int n=count;
                while (n>0) {
                    String s1= String.valueOf(n);
                    chars[num] = (char) (n/Math.pow(10,s1.length()-1) + '0');
                    n %= Math.pow(10,s1.length()-1);
                    num++;
                }
                if(count%10==0){
                    chars[num]='0';
                    num++;
                }
            }
            i+=count;
        }
        return num;
    }
    //验证回文串
//    public static void main(String[] args) {
//        String s1="0P0";
//        System.out.println(isPalindrome(s1));
//    }
//    public static boolean isPalindrome(String s) {
//        String s2=s.toLowerCase();
//        StringBuffer s1=new StringBuffer();
//        int count=0;
//        for(int i=0;i<s.length();++i){
//            if(Character.isLetter(s2.charAt(i))||Character.isDigit(s2.charAt(i))){
//                s1.append(s2.charAt(i));
//                continue;
//            }else{
//                continue;
//            }
//        }
//        for(int i=0,j=s1.length()-1;i<=j;i++,j--){
//            if(s1.charAt(i)!=s1.charAt(j))
//                return false;
//        }
//        return true;
//    }

//    public static void main(String args[]){
//        int num = 10;
//        System.out.println(test(num));
//    }
//    public static int test(int b){
//        try {
//            b += 10;
//            return b;
//        }catch(RuntimeException e){
//
//        }catch(Exception e2){
//
//        } finally{
//            b += 10;
//            return b;
//        }
//    }
}
