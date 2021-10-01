package ch05;

public class MethodTest2 {
    public static void main(String[]args){
        String oddEven = getOddEven(11);
        // =이 붙어있으면 void형이다. 왜? 값을 받았기 때문에..(무조건은 아니다) 근데 문자값을 받았기 때문에 메서드에 void 적지말고 String을 적는다.

        System.out.println("홀짝 : " + oddEven);
        //10 > 짝수
        //13 > 홀수
    }

    public static String getOddEven(int n1) {
        if (n1 % 2 == 0) {
            return "짝수"; //위에서 String이라고 선언했기 때문에 그냥 "짝수" 이렇게 return하는게 먹히는 것 같다.
        }
            return "홀수"; //return 값은 실행이 종료된다는 뜻이기 때문에 return값이 있는 if 값에서는 else 안적어줘도 된다!
                          //없으면 그냥 나가서 남은 값이 return되는듯
    }
}