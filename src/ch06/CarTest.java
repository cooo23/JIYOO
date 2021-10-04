package ch06;

public class CarTest {
    public static void main(String[] args) {
        String car2 = new String("");
        Car car = new Car(); //new 라는 클래스 없이 객체화 불가능 new 뒤에 객체화하고 싶은 클래스 안에 있는 메소드
//    클래스의 변수 = new 클래스
        car.brand = "현대";
        car.nm = "소나타";
        car.drive();
        car.stop();

        Car car3 = new Car();
//     클래스 변수 =
        car3.brand = "기아";
        car3.nm = "K5";
        car3.drive();
        car3.stop();

        Car car4 = new Car();
        car.brand = "현대";
        car.nm = "소나타";
        car.drive();
        car.stop();

        System.out.println(car == car3);
        //false 둘 다 새로 만들었기 때문에 다른 주소값
        System.out.println(car == car4);
        //false 값이 같아도 새로만들었기 때문에 주소값이 달라 false

    }
}
