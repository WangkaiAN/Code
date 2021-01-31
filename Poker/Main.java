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
        // 3. 发牌, 假设有三个玩家, 每个玩家, 给发 5 张牌
// 每个玩家手里有 5 张牌, 这 5 张牌就使用另外一个 ArrayList 表示.
//        List<Card> player1 = new ArrayList<>();
//        List<Card> player2 = new ArrayList<>();
//        List<Card> player3 = new ArrayList<>();
        // players 类型仍然是 List, 泛型参数, 是一个 List<Card> , 每个元素就是一个 List<Card>
        List<List<Card>> players = new ArrayList<>();
        // 每次 add 的元素都是一个 ArrayList<Card> 类型
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Card top = list.remove(0);
                List<Card> player = players.get(i);
                player.add(top);
            }
        }

        // 4. 展示手牌
        for (int i = 0; i < players.size(); i++) {
            List<Card> player = players.get(i);
            System.out.println("玩家" + i + " 的手牌是: " + player);
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
