package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        /*
        배열(Array)
        정수 10개 저장하고 싶을 떄, ex)10명의 점수를 저장해서 평균이나 총점을 낼 때
        int score1, score2, score3..... 100개의 공간 다 넣을 것인가?
        같은 타입의 값을 여러개 저장할 때 좋다
        for문과 함꼐 사용하면 좋다.
         */

        int[] scores = { 83, 90, 87, 100}; //스코어 뒤에 붙여도 되지만 인트값으로 오해할 수 있기 때문에 인트 옆에 괄호를 붙여준다.
        //인트형 배열, 인트와는 다른다. 배열은 레퍼런스타입, 인트는 원시타입
        //배열은 0번부터 시작, 83이 0번, 90이 1번 순으로 88인 4번까지..
        //scores[0] = 11;
        System.out.println( scores[0] );

        System.out.println(scores.length);

        for(int i=0; i<scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
