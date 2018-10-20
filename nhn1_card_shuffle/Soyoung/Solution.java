import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cardCount = Integer.parseInt(br.readLine()); // 카드 숫자
    int[] card = new int[cardCount];
    int p = Integer.parseInt(br.readLine()); // 몇번 수행

    int[] shuffleInfo = new int[p];
    int i, j;
    for (i = 0; i < p; i++) {
      shuffleInfo[i] = Integer.parseInt(br.readLine()); // 몇장이 위에 있는지.
    }
    for (i = 0; i < cardCount; i++) {
      card[i] = i + 1;
    }
    List<Integer> answer1 = solutionMeth(card,p,shuffleInfo);

    for(i=0;i<5;i++) {
      System.out.println(answer1.get(i));
    }
  }
  public static List<Integer> solutionMeth(int[] card, int p, int[] n) {
    List<Integer> cardList = new ArrayList<>();
    for(int c : card) {
        cardList.add(c);
    }
    // Arrays.asList(card);
    int i;
    for(i=0;i<p;i++) {
      cardList = shuffle(n[i],cardList);
    }
    return cardList;
  }
  public static List<Integer> shuffle(int n, List<Integer> arr) {
    System.out.println("arr.size "+arr.size());
    System.out.println("n "+n);
    List<Integer> newList = arr.subList(n,arr.size()-n);

    /*
    if(arr.size()-n >= n) {
       newList = arr.subList(n,arr.size()-n);
     }else {
      newList = arr;
     }*/
    //List<Integer> newList = arr.subList(n,arr.size()-n);
     System.out.println("cut");
      if(newList.size() > n*2)
        newList = shuffle(n,newList);

        
    List<Integer> front = arr.subList(0,n);
    List<Integer> back = arr.subList(arr.size()-n,arr.size());
    for(int i=0; i<front.size();i++) {
      newList.add(front.get(i));
    }
    for(int i=0; i<back.size();i++) {
      newList.add(back.get(i));
    }   
    
    return newList;
  }
}

