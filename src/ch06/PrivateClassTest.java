package ch06; //패키지만 다르면 똑같은 클래스 여러개 만들 수 있다. but 쓰려면 import 해야하거나 풀네임 입력

public class PrivateClassTest {
    public static void main(String[] args) {
    PrivateClass pc = new PrivateClass();//import 안했을 시 여기서 알트 엔터 치면 자동으로 import해준다
        //pc.val = 10; // private 접근 불가능
        pc.defaultVal = 10; //패키지만 달라져도 default 사용할 수 없다.
    }
}
