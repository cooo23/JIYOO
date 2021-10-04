package ch06;
/*
    2가지로 구성
    - 멤버필드 (변수, 상수)
    - 메소드
 */
public class Car {
    String nm;
    String brand;
    //멤버필드, 멤버필드는 전역변수이다.
    //전역변수는 객체가 소멸될 때까지 살아있다.

    //오버로딩 : 똑같은 이름의 메소드를 여러개 만들 수 있는 기술
    // car(){}, 랑 car(string brand, String nm){} 이렇게... C언어는 이런 기능 없어서 따로 만들어야함
    //물론 ()안의 파라미터가 달라야한다. 타입은 같은데 변수만 바꾸면 안된다. 구분이 가능해야한다.
    //타입만 중요, 타입의 갯수, 순서, 리턴타입(void나 int 등)은 상관없음!
    
    //기본 생성자
    //1. 이름이 클래스와 같아야한다.
    //2. 리턴타입이 없어야한다.
    //*. 생성자가 하나도 없으면 컴파일러가 자동으로 넣어준다.
    Car() {} // 앞에 void 적으면 기본생성자가 메소드가 된다. 괄호안에 아무것도 없어야함

    Car(String brand, String nm){ //지역변수, 전역변수
        this.brand = brand;//this는 상수, 자신의 주소값이 들어가있다.\
        this.nm = nm;

        //외부에서 들어온 주소값이 멤버필드와 이름이 같으면 구분해주기 위해 this를 사용해준다.

    }//this.brand = brand; 안찍으면 출력할때 null 나옴
    //지역변수는 구문밖을 나가면 소멸된다.
    
    void drive() {
        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
    }

    void stop() {
        System.out.printf("%s의 %s가 멈춘다.\n", brand, nm);
    }
}
