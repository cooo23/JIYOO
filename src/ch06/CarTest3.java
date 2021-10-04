package ch06;

public class CarTest3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "현대";
        car.nm = "소나타";
        
        Car car2 = new Car("현대", "그랜저");
        System.out.println("car2.brand : " + car2.brand);

        car2 = car;
        System.out.println("car2.nm : " + car2.nm);
        //car2를 car라고 했기때문에 car2의 주소값이 날아가고 garbage collection이 지워버린다.


    }
}
