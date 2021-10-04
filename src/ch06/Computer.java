package ch06;

public class Computer {
    static  String brand;
    int cpu;

    public void print() {
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다.", brand, cpu);
    }
/*
    public static void print2() {
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다.", brand, cpu);
        // 빨간줄 뜨는이유 : static은 스스로 메모리에 올라간다. 안붙은애들은 일부러 올려줘야함
        // 위에 brand와 cpu는 이미 메모리에 올라가있음. cpu는 이미 printf때문에 올라감
        // static이 발목을 잡음, 객체화하기 전에 static이 먼저 올라간 상태기 떄문에
        // 이미 cpu를 메모리에 가지고 올라갈 수가 없다.
    }
 */
}
