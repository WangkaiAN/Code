package Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static String[] Color={"♥","♠","♣","♦"};
    public static void main(String[] args) {
        List<Card> list=new ArrayList<>();
        BuyPoker(list);
//        System.out.println(list);
        Collections.shuffle(list);
        int n=3;
        Play(list,n);
    }

    private static void Play(List<Card> list, int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                System.out.print(list.remove(j));
            }
            System.out.println();
        }
    }

    private static List BuyPoker(List<Card> list) {
        for(int i=0;i<4;i++){
            for(int j=2;j<=10;j++){
                Card ca=new Card(Color[i],j+"");
                list.add(ca);
            }
            list.add(new Card(Color[i],"J"));
            list.add(new Card(Color[i],"Q"));
            list.add(new Card(Color[i],"K"));
            list.add(new Card(Color[i],"A"));
        }
        list.add(new Card("","BigGhost"));
        list.add(new Card("","SmallGhost"));
        return list;
    }
}
