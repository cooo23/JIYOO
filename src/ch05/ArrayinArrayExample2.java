package ch05;

public class ArrayinArrayExample2 {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {0, 0, 0, 10},
                        {0, 0, 0},
                        {0, 0, 0, 0, 0}
                };                               // =int[2][3]과 같은 모양
        //수동으로 만든거기 때문에 4개, 3개 이렇게 만들 수 있지만 거의 안쓴다..

        System.out.println(arr.length);     //3 몇 줄인지
        System.out.println(arr[0].length);  //4 1번쨰 줄의 항목 몇 개인지
        System.out.println(arr[1].length);  //3 2번쨰 줄의 항목이 몇 개인지
        System.out.println(arr[2].length);  //5 3번째 줄의 항목이 몇 개인지

        for (int i = 0; i < arr.length; i++) {
            //                  3
            for (int z = 0; z < arr[i].length; z++) {
                System.out.printf("(%d, %d) : %d\t", i, z, arr[i][z]);
            }
            System.out.println();
        }
    }
}
