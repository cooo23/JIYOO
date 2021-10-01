package ch04;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        System.out.println("Up & Down Game!!");
        Scanner scan = new Scanner(System.in);
        //1~100
        int target = (int)(Math.random()*100) + 1;
        int val = 0, cnt = 0;
        //System.out.println("target : " + target);
        while(true) {
            cnt++;
            System.out.print("숫자를 입력해 주세요 : ");
            val = scan.nextInt();

            if(val == target) {
                break;
            } else if(val > target) {
                System.out.println("Down!");
            } else {
                System.out.println("Up!");
            }
        }
        System.out.printf("게임 끝! %d번 걸림", cnt);
    }
}
