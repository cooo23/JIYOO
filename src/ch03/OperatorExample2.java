package ch03;

public class OperatorExample2 {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play);

        play = !play; // !는 반대로 바꾼다 즉 true는 false로
        System.out.println(play);

        play = !play; // 다시 true
        System.out.println(play);

        play = !play; // 다시 false
        System.out.println(play);
    }
}
