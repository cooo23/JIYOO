package ch05;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MethodTest {
    public static void main(String[] args) {
        printMyself("홍길동", 17, 180.82f, 'A');
        //황장군의 키는 180.82cm, 나이는 1700세, 혈액형은 A형이다.

        int mon = (int)(Math.random() * 12) +  1;//1~12

        printSeason(mon);
        //12, 1, 2 > "겨울"
        //3, 4, 5 > "봄"
        //6, 7, 8 > "여름"
        //9, 10, 11 > "가을"
        //1~12 사이값이 아닌 값이 들어오면 "알 수 없음"
    }
    
    public static void printMyself(String nm, int age, float height, char bloodType) {
        System.out.printf("%s의 나이는 %d세, 키는 %.2fcm 혈액형은 %c이다.\n",nm,age,height,bloodType);
    }

    public static void printSeason(int n1) {
        if (n1 == 12 || n1 <= 2) {
            System.out.println("겨울");
        } else if (n1 <= 5) {
            System.out.println("봄");
        } else if (n1 <= 8) {
            System.out.println("여름");
        } else if (n1 <= 11) {
            System.out.println("가을");
        } else {
            System.out.println("알 수 없음");
        }
        System.out.printf("%d월", n1);

    }


}
