package ch04;

public class RandomExample {
    public static void main(String[] args){
        int num = (int)(Math.random() * 6); //메서드 인지 확인하는법 괄호유무
        /*
        랜덤함수는 double형
        0.0 ~ 0.999
        5.49999979
        0~5
        */

        System.out.println("num : " + num);

        // 2~7
        int num2 = (int)(Math.random() * 6 + 2);
        System.out.println("num2 : " + num2);

        // 55~108
        int num3 = (int)(Math.random() *54 + 55);
        System.out.println("num3 : " + num3);

        // 0~100
        int num4 = (int)(Math.random() *101);
        System.out.println("num4 : " + num4);
    }
}
