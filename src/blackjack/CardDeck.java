package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    private String[] patters;


    public CardDeck() { //기본 생성자
        //메소드와 생성자의 다른점 두 가지
        //1. 클래스명이랑 이름이 같다. (생성자는)
        //2. 리턴타입이 없다.(void, int 붙는 순간 메소드로 바뀜)
        init();
    }

    private void init(){
        String[] patters = {"스페이드", "하트", "클럽", "다이아몬드"};
        cards = new ArrayList(); // 리스트의 객체 주소값을 cards 에 넘겨줌
        // 처음 리스트만들면 0개짜리 방을 만든다. 밑에 size가 현재 0인상태 그래서 호출하면 for문이 안돌기 때문에 아무것도 안뜬다.
        for(int i=0; i<patters.length; i++) { //4번도는 바깥 for문(카드모양)
            for(int z=1; z<=13; z++) { //13번도는 안쪽 for문(숫자)
                String denomination = String.valueOf(z);
                switch (z){ // 영어카드를 숫자료 표기하기 위한 switch문
                    case 1:
                        denomination = "A"; break;
                    case 11:
                        denomination = "J"; break;
                    case 12:
                        denomination = "Q"; break;
                    case 13:
                        denomination = "K"; break;
                    default:
                        denomination = String.valueOf(z); // 2~10은 정수를 문자열로 변경
                }
                Card c = new Card(patters[i], denomination);
                cards.add(c);
                //cards.add(new Card(patters[i], denomination); 한줄로도 가능
            }//내부 for문
        }//전체 for문 종료
    }// 이거 시험문제 나옴 외우자;;;init()요 항목...


    public Card getCard() {//파라미터값을 아무것도 안넣는다는것은 뭘까?
        //카드를 어떤 특수한 값을 정해서 주는게 아니라 랜덤하게 준다.
        //if 콜렉션을 배열로 했다면 먼저 섞고, 순차적으로 카드를 줬을꺼다.
        //if 콜렉션을 ArrayList로 했다면 랜덤하게 카드를 준다.
        int rIdx = (int)(Math.random() * cards.size()); //랜덤을 뽑을 때마다 줄어들어야하기 때문에, 정수를 쓰면 안되고 카드의 사이즈값을 써야한다.
        return cards.remove(rIdx);

//        return cards.remove((int)(Math.random() * cards.size())); //이렇게 써도 되는데 가독성 떨어짐
    }


    public void showAllCards() {
/*
        for(int i=0; i<cards.size(); i++) {
            Card c = cards.get(i);
            System.out.println(c);
        }
*/
        //ForEach 위의 식과 같은 문법, 넣는 순서가 중요한 값은 For Each문쓰는게 좋다
        for(Card c : cards) { //자기가 들고 있는 값만큼 계속 넣어준다.
            System.out.println(c);
        }

    }





}
