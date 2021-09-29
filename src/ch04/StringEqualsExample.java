package ch04;

public class StringEqualsExample {
    public static void main(String[] args) {
        //문자열값 비교!, 절대 == 비교하시면 안된다.!!!!!!!!!

        String str1 = "안녕하세요";
        String str2 = new String("안녕하세요"); //원래 이렇게 써야함
        //new 쓸 때마다 새로운 주소값을 저장, 구조가 같더라도 선언을 다른이름으로 했기 때문에 내용이 동일하더라도 주소값이 절대 같아질 수 없다.

        System.out.println(str1 == str2); //주소값이 같은지를 물어보는 질문. 내용이 같지만 주소값이 다르기 때문에 false

        String str3 = str2; //여기서 둘이 같다고 선언해버림
        System.out.println(str3 == str2); // 따라서 true

        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str2.equals(str1) : " + str1.equals(str2));
        System.out.println("str3.equals(str1) : " + str1.equals(str2));

    }
}
