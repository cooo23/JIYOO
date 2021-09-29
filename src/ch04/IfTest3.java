package ch04;

public class IfTest3 {
    public static void main(String[] args) {
        //60~100점 나오도록
        int score =(int)(Math.random() *41)+60;
        char grade = 'D';
        char pm = ' ';

        if(score>=90) {grade = 'A';}
        else if (score >= 80) {grade = 'B';}
        else if (score >= 70) {grade = 'C';}

        if(score >= 70) {
            int mVal = score % 10;
            if (mVal >= 8 || score == 100) {pm = '+';}
            else if (mVal <= 3) {pm = '-';}
        }
        System.out.printf("%c%c", grade, pm);
    }
}
//중복되는 부분을 최대한 제거, 식이 바뀌면서 생기는 오류부분 찾아서 수정 ex)100점일 떄 +가 안나오거나 D등급일 때 -가 뜨거나