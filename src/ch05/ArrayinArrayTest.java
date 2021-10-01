package ch05;

public class ArrayinArrayTest {
    public static void main(String[] args) {
        /*
        김영희 : 총점 : 몇점, 평균: 몇점
        김철수 : 총점 : 몇점, 평균: 몇점
        홍길동 : 총점 : 몇점, 평균: 몇점
        수학 : 총점 : 몇점, 평균: 몇점
        영어 : 총점 : 몇점, 평균: 몇점
        국어 : 총점 : 몇점, 평균: 몇점

         */
        int[][] scores = {
                {75, 100, 88}, //수학
                {98, 100, 76}, //영어
                {100, 90, 100} //국어
        };

        String[] names = {"김영희", "김철수", "홍길동"};
        int sum = 0, math = 0, eng = 0, kor = 0;
        for(int i=0; i< scores.length; i++){
            for(int j=0; j<scores.length; j++){
                sum += scores[i][j];
                if(i == 0) {
                    math += scores[i][j];

                }
            }
        }
        System.out.println();

    }
}
