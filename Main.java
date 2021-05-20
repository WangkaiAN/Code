package day28;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        oddInOddEvenInEven(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void oddInOddEvenInEven(int[] arr) {
        int i=0,j=1;
        while(i<arr.length && j<arr.length){
            while(i<arr.length && arr[i]%2 ==0){
                i+=2;
            }
            while(j<arr.length && arr[j]%2 ==1){
                j+=2;
            }
            if(i<arr.length && j<arr.length){
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
