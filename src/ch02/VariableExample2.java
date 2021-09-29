package ch02;

public class VariableExample2 {
    public static void main(String[] args){
        /*
           /*+enter
         */
        float f;//4byte
        double d;//8byte

        int n1;
//        n1 = 10.1; 안됨
        f = 10.1f;
        d = 10.1;

        double d2 = f*f;
        double d3 = (double)f*f;
          float f2 = (float)(d*d);

        float f3 = (float)((float)d *d);
        //float f3 = (float)d *d); 에러 터지는 이유 : double형이 되는데 float이미 선언한게 다시 double형이 됨. 그리고 결과값 보니 float값이라 에러
    }
}
