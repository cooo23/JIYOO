package ch04;

public class IfTest4 {
    public static void main(String[] args) {
        String position = "과장";

        if (position.equals("부장")) {
            System.out.println("700만원");
        } else if (position.equals("과장")) {
            System.out.println("500만원");
        } else {
            System.out.println("300만원");
        }
        //("부장".equals(position))라고 쓰는게 에러발생에 있어서 더 좋다. ==해도 돌아가긴하는데 주소값 비교기 때문에 문제가 있는듯...
        
        //부장이면 "700만원"
        //과장이면 "500만원"
        //부장, 과장이 아니면 "300만원"
        
    }
}
