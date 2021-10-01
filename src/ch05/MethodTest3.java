package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
        int rVal = getRandom(30, 40); //30~40 랜덤한값을 리턴하는 메소드를 구현
        System.out.println(rVal);

        int absVal = getABS(10);
        int absVal2 = getABS(-10);
        System.out.println(absVal);
        System.out.println(absVal2);

    }

    public static int getRandom(int n1, int n2){
        int result = (int)(Math.random() * (n2 - n1 + 1)) + n1; //만들었지만 (n2 -n1 +1)에서 +1을 안해줘서 틀렸다... 실수하지말자
        return result; //여기도 result없애고 return위로 올려서 더 간단하게 한 줄
    }

    public static int getABS(int n1){
        if(n1 >= 0){
            return n1;
        } return -n1;
    }

    public static int getABS1(int n1){ //삼항식으로 더 간단하게
        return n1 <0 ? -n1 : n1;
    }
}
