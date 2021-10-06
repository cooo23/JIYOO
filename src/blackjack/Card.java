package blackjack;

import java.util.List;

public class Card {
    private String pattern; // 무늬
    private String denomination; //숫자, 값

    public Card(String pattern, String denomination) { //이게 생성자 여기에다가 값 넣는다.
        this.pattern = pattern;
        this.denomination = denomination;
    }
    
    
    public String getPattern(){ //게터
        return this.pattern;
    }
    public String getDenomination(){ return this.denomination;} //게터
    public int getPoint(){
        //denomination 값이 "A" > 1
        //"2" > 2
        //"3" > 3
        //...
        //"10" > 10
        //"J", "Q", "K" > 10
        switch (denomination) {
            case "A" : return 1; //여기선 return값 쓰면 나가기 때문에 break문 필요없다.
            case "J" : case "Q" : case "K" : return 10;
            default: //"2" ~ "10" > 문자열 정수형으로 parsing (파싱)
                return Integer.parseInt(denomination);
        }

    }


    @Override
    public String toString() {
        return String.format("%s - %s", this.pattern, this.denomination); //단일값일땐 format 대신 valueOf
    }


} //여기까지만해도 3번문제 정답이다...
