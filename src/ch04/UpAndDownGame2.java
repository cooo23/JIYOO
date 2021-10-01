package ch04;

import java.util.Scanner;

public class UpAndDownGame2 {
    public static void main(String[] args) {
        System.out.println("업다겜");
        Scanner scan = new Scanner(System.in);
        int target = (int)(Math.random() * 100) + 1;
        int val = 0,cnt = 0;

        while (true) {
            cnt++;
            System.out.print("숫자를 입력해 주세요: ");
            val = scan.nextInt();

            if(val == target) {
                break;
            } else if (val > target) {
                System.out.println("다");
            } else {
                System.out.println("업");
            }
        }
        System.out.printf("게임끝 %d번", cnt);

    }
}
