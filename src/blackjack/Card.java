package blackjack;

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

    public String getDenomination(){ //게터
        return this.denomination;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.pattern, this.denomination); //단일값일땐 format 대신 valueOf
    }


} //여기까지만해도 3번문제 정답이다...
