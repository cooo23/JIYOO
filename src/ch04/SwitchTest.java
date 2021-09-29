package ch04;

public class SwitchTest {
    public static void main(String[] args) {

        int mon = (int)(Math.random() * 12) + 1; //1~12
        System.out.printf("%d월 ", mon);
        //switch문에 mon변수를 활용하여서
        //12, 1, 2 > "겨울"
        //3, 4, 5 > "봄"
        //6, 7, 8 > "여름"
        //9, 10, 11 > "가을"

        switch (mon) {
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default: System.out.println("알수없음");
        }
    }
}
// 집가서 참조타입, 메모리 영역 보기, 그리고 기출문제 답확인하기