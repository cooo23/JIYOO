package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardTest {
    public static void main(String[] args) { //각각 다른 52장을 만드려면 new를 52번 써야한다...
        //스페이드, A를 갖는 카드객체를 만들어봐라

        Card c1 = new Card("Spade", "A");
        Card c2 = new Card("Spade", "2");
        
        //ArrayList, 배열

        List<Card> cards = new ArrayList(); //<>안에 적은것은 구체적으로 어떤 배열인지 지정해주는 것, 따로 형변환 필요없다.
        cards.add(c1);
        cards.add(new Card("스페이드", "2"));
        //cards.add(new Card("Spade", "A")); 이렇게 해도 된다.

        Card ccc = cards.get(0);

        //뺄때

        System.out.println(c1.getPattern());
        System.out.println(c1.getDenomination());

        System.out.println(c1); //스페이드 - A
        System.out.println(c2); //스페이드 - 2

        CardDeck cd = new CardDeck();
        cd.showAllCards(); //지금 사이즈값이 없어서 아무것도 안뜬다.


        //52장의 카드가 "스페이드"- A~K
        //"하트", "클럽", "다이아몬드"

    }

}
