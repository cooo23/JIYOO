package ch03;

public class OperatorExample4 {
    public static void main(String[] args) {
        int n1 =10;
        n1++;
        ++n1;
        System.out.println(n1);
        n1--;

        System.out.println(n1);
        System.out.println();

        int n2 = 40;
        System.out.println(++n2); // 1을 먼저 더하고 출력
        System.out.println(n2);
        System.out.println(n2++); // 기존값을 먼저 출력 하고 1을 더함, 따라서 다음값에 적용
        System.out.println(n2);

        System.out.println("-----");
        int n3 = 50;
        n3 = n3 + 3; // 연산은 오른쪽부터 해서 왼쪽에 대입
        n3 = n3 + 3;
        System.out.println("n3 : " + n3);

        System.out.println("-----");
        int n4 = 50;
        n4 += 3; // 위의 식 축약형
        n4 += 3;
        System.out.println("n4 : " + n4);

    }
}
