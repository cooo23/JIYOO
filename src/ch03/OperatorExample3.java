package ch03;

public class OperatorExample3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2; //true
        boolean result2 = n3 > n4; //false

        System.out.println(result1 && result2); // 둘 중 하나라도 false가 있으면 false, 둘 다 true여야 true
        System.out.println(result1 || result2); // 둘 중 하나라도 true가 있으면 true, 둘 다 false여야 false

        System.out.println(true && true && false && true && true); //false
        // 결과값이 false가 나오면 뒤에 수식을 생략하기 떄문에  false나올 확률이 높은 애들을 앞에 배치하면 연산이 빠르다.
        System.out.println(n1 >= n2 || n3 < n4 || n1 > n4); //true
        // 결과값이 true가 나오면 뒤에 수식을 생략하기 떄문에  true나올 확률이 높은 애들을 앞에 배치하면 연산이 빠르다.
    }
}
