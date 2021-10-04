package ch05;

import java.util.Locale;

public class PrimitiveAndRefExample2 {
    public static void main(String[] args) {
        String s1 = new String("Hello"); //String은 절대 자기값을 바꿀 수 없다. 깊은복사되서 그렇다고함
        System.out.println(s1);
        changeVal(s1);
        System.out.println(s1);
    }

    public static void changeVal(String str) {
        str = "안녕"; //안녕이란 값을 가진 새로운 str생성, 그리고 이 메소드가 끝나버리면 생성된 str이 없어짐
        //그래서 Hello가 안녕으로 바뀌지 않음
    }

}
