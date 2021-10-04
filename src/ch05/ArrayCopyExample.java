package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1; //얕은 복사 (Shallow copy)
        //배열 작성할 땐 int[] arr이렇게 만들것, int arr[] 이렇게도 되는데 int값으로 헷갈릴수가 있음, 배열은 int값아님
        //주소값만 복사해주는것

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        arr2[0] = 5;

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        System.out.println(arr1 == arr2);
        //레퍼런스값의 ==비교는 주소값이 같냐 물어보는것

        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
    }
}
