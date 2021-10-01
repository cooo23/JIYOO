package ch05;

import java.util.Scanner;

public class ArrayTest2 {
        /*
        숫자 3개를 입력해 주세요.
        숫자1 :
        숫자2 :
        숫자3 :

        합계 :
        평균 :
         */


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("몇 개의 숫자를 사용할 것입니까? : ");
            int LEN = scan.nextInt();
            int[] numberArr = new int[LEN];
            System.out.printf("숫자 3개를 입력해 주세요.\n", numberArr.length);
            int sum = 0;
            for(int i=0; i<numberArr.length; i++) {
                System.out.printf("숫자%d : ", i+1);
                numberArr[i] = scan.nextInt();
                sum += numberArr[i];
            }
            //쌤이 sum 계산하는거 아래처럼 분리하라고 하신다.하드코딩 피하기? sum=0 부분과 sum을 합하는 부분
            /*
            int sum =0;
            for(int i=0; i<numberArr.length; i++) {
            sum += numberArr[i];
            } 
             */

            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + sum/numberArr.length);

        }


}

