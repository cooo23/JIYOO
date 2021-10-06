package blackjack;

public class Dealer extends Gamer {
    public void moreCard(CardDeck cd) {
        //본인의 카드가 2장인지 확인
        //2장의 카드의 점수가 16점 이하인지 확인
        //16점 이하면 한장 더 뽑기

        //private라서 Gamer의 myCard호출이 안된다.
        //불러올 수 있는방법 openCards로 받아온다. 또는 Gamer의 private값을 protected로 바꿔준다.
        //List<Card> Mycards = opencards();
        //List<Card> localMycards = opencards();

        if(myCards.size() == 2){ //3장으로 바꾸고 싶을 때는 여기 변수로 설정하고
            int sumPoint = 0;
            for(int i=0; i<2; i++){ //여기도 변수로 넣으면 편하다(매직넘버)
                Card c = myCards.get(i);
                sumPoint += c.getPoint();
            }
            if(sumPoint <= 16){
                Card c = cd.getCard(); //어차피 Card c 는 여기 나가면 죽기 때문에 게이머의 Card c와 독립적으로 쓸 수 있다는 것 같다.
                receiveCard(c);

                //receiveCard(cd.getCard());
            }

            /*
            Card c1 = myCards.get(0)
            Card c2 = myCards.get(1)

            sumPoint = sumPoint + c1.getPoint();
            sumPoint = sumPoint + c2.getPoint();
             */



        }

    }
}
