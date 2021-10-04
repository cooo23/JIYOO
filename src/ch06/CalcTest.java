package ch06;

public class CalcTest {
    public static void main(String[] args) {

        String str = "10";
        int intStr = Integer.parseInt(str);
        System.out.println(intStr + 10);
        //System 대문자로 시작하고 소문자로 있으니 클래스, out.이니까??인데 안에 println이라니 메소드 호출
        
        int result = StaticCalc.sum(10, 20);
        System.out.println("static sum : " + result);

        Calc calc = new Calc();
        calc.n1 = 10;
        calc.n2 = 20;

        int result2 = calc.sum();
        System.out.println("instance sum : " + result2);

        /*int result2 = Calc에 있는 sum() 호출해서 결과물 받은 다음에
        System.out.println("instance sum : " + result2);*/
    }
}
