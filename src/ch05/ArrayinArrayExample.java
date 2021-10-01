package ch05;

public class ArrayinArrayExample {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        //arr[1][1] = 10; 값을 할당할 때

        System.out.println(arr.length);     //2 전체 줄의 갯수
        System.out.println(arr[0].length);  //3 1번째 줄의 열 갯수
        System.out.println(arr[1].length);  //3 2번째 줄의 열 갯수



        for(int i=0; i<arr.length; i++) {

            for(int z=0; z<arr[i].length; z++) {
                System.out.printf("%d, %d : %d\t", i, z, arr[i][z]);
            }
            System.out.println();
        }
    }
}
