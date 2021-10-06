package blackjack;

import java.util.List;

public class Rule {
    public int getScore(List<Card> cards){
        int sumPoint = 0;
        for(int i=0; i< cards.size(); i++){
            Card c = cards.get(i);
            sumPoint += c.getPoint();
        }
        return sumPoint;
    }

    public void getWinner(Dealer dealer, Gamer gamer){
        int dealerScore = getScore(dealer.openCards());
        int gamerScore = getScore(gamer.openCards());

        System.out.println("dealerScore : " + dealerScore);
        System.out.println("gamerScore : " + gamerScore);

        //경우의 수 3 (비긴경우(점수 같음, 둘다 21점 넘김), 딜러 승, 게이머 승)

        final int STAND_SCORE = 21;
        if ((dealerScore == gamerScore) || (dealerScore>STAND_SCORE && gamerScore>STAND_SCORE)) {
            System.out.println("비김");
        } else if ((dealerScore > gamerScore) || (gamerScore>=STAND_SCORE && dealerScore<=STAND_SCORE)) {
            System.out.println("딜러승");
        } else if ((dealerScore < gamerScore) || (gamerScore<=STAND_SCORE && dealerScore>=STAND_SCORE)) {
            System.out.println("게이머승");
        } else {
            System.out.println("재경기");
        } // 여기부분은 쌤 코드 다시보고 정리하기


        /*
        if((dealerScore >= STAND_SCORE) && (gamerScore >= STAND_SCORE)){
            System.out.println("비김");
        } else if((dealerScore>= STAND_SCORE) && (gamerScore<STAND_SCORE)){
            System.out.println("게이머승");
        } else if ((gamerScore>= STAND_SCORE) && (dealerScore<STAND_SCORE)) {
            System.out.println("딜러승");
        } else if (dealerScore < gamerScore) {
            System.out.println("게이머승");
        } else if (dealerScore > gamerScore) {
            System.out.println("딜러승");
        } else{
            System.out.println("재경기");
        }
         */
    }



}
