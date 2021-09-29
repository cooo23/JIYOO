package ch04;

import java.sql.SQLOutput;

public class IfTest {
    public static void main(String[] args) {
        int score =95;

        if(score >=90){
            if (score >= 97) {
                System.out.println("A+");
            } else if (score <= 93){
                System.out.println("A-");
            } else System.out.print("A");
        }
        else if(score >=80){
            if (score >= 87) {
                System.out.println("B+");
            } else if (score <= 83){
                System.out.println("B-");
            } else System.out.print("B");
        }
        else if(score >=70){
            if (score >= 77) {
                System.out.println("C+");
            } else if (score <= 73){
                System.out.println("C-");
            } else System.out.print("C");
        }
        else{
            System.out.print("D");
        }


        //점수가 90이상이면 A 등급
        //점수가 80이상이면 B 등급
        //점수가 70이상이면 C 등급
        //70점 미만이면 D 등급

        //C등급 이상이면
        // ?7점 이상이면 +
        // ?3점 이하이면 -

        // 예) 98점이면 A+
        // 예) 85점이면 B
        // 예) 73점이면 C+

    }
}
