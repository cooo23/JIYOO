package ch05;

public class PrimitiveAndRefExample {
    public static void main(String[] args) {
        int val = 10;
        Box box = new Box();
        box.val = 10;

        Box box2 = box;
        // 이게 new로 선언한게 아니기 때문에 box랑 주소값이 같다는 뜻이다.
        // 그래서 밑에 box2가 box와 주소값이 같아서 밑에 20찍힘
        box2.val = 20;

        box2 = new Box(); //위에서 box2가 box랑 같다고 선언했다가, 새로운 box2의 값을 생성함
        // 따라서 box2의 값은 default 값을 가지게 되고 출력하면 0이 나온다.

        System.out.println("val : " + val);
        val = changeVal(val);
        System.out.println("val : " + val);
        System.out.println("------");
        System.out.println("box.val : " + box.val);
        changeVal(box);
        //changeVal(box.val);은 변경이 안된다.
        //왜냐하면 box.val은 int값이기 때문에 밑에 int pval로 값이 들어가기 떄문
        System.out.println("box.val : " + box.val);
        System.out.println("box.val : " + box2.val);

    }

    public static int changeVal(int pval) {

        return pval * 2;

        /*pval = 30; // 주소값이 없어서 바뀌지않음*/
        //val 값을 30으로 바꾸었지만 이 함수가 종료되면서 30이 사라지고 다시 10값이 반환된다.
    }

    public static void changeVal(Box pbox) {
        pbox.val = 30; //주소값을 바꾸라고 명령
        //box 클래스를 생성해서 주소값을 준다. 그럼 이 주소값을 변경해주라고 명령해서 주소값을 바꿔준다.
        //종료되고 메모리에서 사라지지만 이미 주소값으 바꿔준상태기 때문에 30이 반환되어있다.
    }

}


class Box { //클래스만들떄는 대문자로 시작하는게 좋다
    int val;
    int val2;
    int val3;
    String str1;
}
//클래스를 한 파일에 두개 만들수 있음.
// class 앞에 public 을 붙일 수 있는것은 같은 파일명 밖에 없음