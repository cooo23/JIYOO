package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        //input0, output 0 (비void형)
        int result = sum(10, 20);
        System.out.println("sum : " + result);
    }

    public static int sum(int n1, int n2){      //return값이 있다는 말은 void아님, 그래서 int넣어줌
        // 여기서 int는 return되는 값의 타입을 나타낸다.
        return n1 + n2; // retrn 값을 고정시키면 ex)10, 위에 어떤식을 적어도 합은 10으로 고정된다.
    } //return이 좋은 이유는 다시 값이 반환되기 때문에 2차가공이 가능하다.
}
