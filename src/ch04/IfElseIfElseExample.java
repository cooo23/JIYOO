package ch04;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 90) {
            System.out.println("A 등급");
        }
        
        else if (score >=80) {
            System.out.println("B등급");
        }

        else if (score >=70) {
            System.out.println("C등급");
        }

        else {
            System.out.println("D등급");
        }
    }
}
//if문 그룹은 무조건 하나만 실행된다.