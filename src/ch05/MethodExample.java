package ch05;

public class MethodExample {

//                                 파라미터(매개변수)
//    public static   void      main(String[] args)
//    X      X     리턴타입   메소드명              (public, static은 메서드에 필부부분 아님)
//              |메소드 선언부(리턴타입부터 파라미터까지|
                {                                }
//              |     메소드 구현부(대괄호 부분)     |

//리턴타입은 void부분과 void가 아닌 부분 두 개가 있다. void형은 output이 없다. void형이 아닌부분은 return값이 있다(output이 있다).
//메소드명은 이름,
//파라미터(매개변수)는 외부에서 값이 들어오는 타입(String)과 타입명(args)

    public static void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));
    }
//void타입은 반환이 안되기 때문에 값을 보내고 나면 더 수정이 안된다. 내 생각엔 출력이 메소드에서 결정되는 것인지 메인함수에서 출력되는것인지 정하는 차이인것 같다.
    public static void main(String[] args) {
        sum(10, 20);
        sum(50, 120);
        minus(100,50);
    }

    public static void minus(int n1, int n2) {
        System.out.println("minus : " + (n1 - n2));
    }
}
