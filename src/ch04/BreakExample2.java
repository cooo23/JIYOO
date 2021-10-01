package ch04;

public class BreakExample2 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            for(int z=100; z<110; z++) {
                if(z == 103) { break; } //안쪽 for문 박살
                System.out.printf("%d - %d\n", i, z);
            }
        }
        System.out.println("--------------");
        OUT_FOR: //레이블(label)
        for(int i=0; i<10; i++) {
            for(int z=100; z<110; z++) {
                if(z == 103) { break OUT_FOR; } //바깥 for문 박살, continue도 가능, 대문자나 상수로 주로 레이블 정의, 소문자도 상관없는데 잘안쓰는듯
                System.out.printf("%d - %d\n", i, z);
            }
        }
    }
}
