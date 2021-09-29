package ch04;

public class SwitchExample {
    public static void main(String[] args){
        int num = (int)(Math.random() * 6) + 1;

        switch(num) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
        }
    }
}
/*
switch값에는 정수랑 문자열만 들어간다. 실수값안들어간다(double, float)
break를 만나야만 빠져나온다. 해당 값이 나온경우 해당 case로 진입, break없을 시 해당값과 관계없는 다음 case로 진입한다.폭포수처럼 모두 진행
default값은 어느 위치에 있어도 상관없음
 */