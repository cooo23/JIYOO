package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = {100, 87, 56, 23, 98, 30, 32, 17, 22};
        
        //점수가 짝수인 친구들만 점수 프린트 해주시고
        //점수가 홀수인 친구들의 함계점수도 프린트 해주세요.

        int sum0 = 0, sum1 =0;
        for(int i=0; i<scores.length; i++) {
            if(scores[i] % 2 == 0) {
                sum0 += scores[i];
            } else {
                sum1 += scores[i];
            }
        }
        System.out.printf("짝수점수의 합 : %d\n", sum0);
        System.out.printf("홀수점수의 합 : %d", sum1);
    }
}
//쌤이 짜준 코드랑 살짝 다름, 다운받을 것