package ch03;

public class OperatorExample5 {
    public static void main(String[] args) {

        //삼항식
        int n1 = 10;
        int n2 = 11;
        
        System.out.println(n1 >= n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다");
        //                  1항(식)              2항                  3항
        //                  참or거짓        참일 경우 출력         거짓일 경우 출력

        System.out.println(!(n1 >= n2) ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다");
        //수식에 느낌표 넣어서 만들면 당연히 반대로 출력된다.

        String result = n1 >= n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다"; // 출력이 문자로 나오기 떄문에 String
        int result2 = n1 >= n2 ? 1 : 0; //출력이 정수로 나오기 때문에 int, 파이썬이나 자바스크립트에선 o이나 1이 참 거짓으로 가능해서 boolean도 되는듯>? 근데 자바는 안됌


        //mod (나머지)
        System.out.println(10 % 2);
        System.out.println(11 % 2);
        System.out.println(12 % 2);
        System.out.println(13 % 2);

        //String str1 = 1; 자동형변환이 안됨 왜나하면 1은 원시타입, String은 레퍼런스타입이기 떄문에 주소값이 와야함
        String str1 = Integer.toString(n2);
        String str2 = String.valueOf(n2);
        //파싱(parsing) : 문자를 숫자로, 숫자를 문자로 형변환할 떄 쓰는말, 숫자끼리 교환은 파싱이란 말을 안씀

    }
}
