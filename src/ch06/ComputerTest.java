package ch06;

public class ComputerTest {
    public static void main(String[] args) {
        Computer.brand = "삼성";
        System.out.println("Computer.brand : " + Computer.brand);

        Computer c1 = new Computer();
        c1.cpu = 10;
        System.out.println("c1.brand : " + c1.brand);
        System.out.println("c1.cpu : " + c1.cpu); //주소값으로도 접근가능 but 잘못된 사용

        Computer c2 = new Computer();
        c2.brand = "애플";
        c2.cpu = 20;
        System.out.println("c1.brand : " + c2.brand);
        System.out.println("Computer.brand : " + Computer.brand);
        System.out.println("1.cpu : " + c2.cpu);
        System.out.println("-----");
        System.out.println("c1.brand : " + c1.brand);
        System.out.println("c1.cpu : " + c1.cpu);

    }
}
