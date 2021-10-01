package ch04;

public class ForStarTest3 {
    /*
        if star == 2
        _*
        **

        if star == 3
        __*
        _**
        ***

        if star == 4
        ___*
        __**
        _***
        ****
     */
    public static void main(String[] args) {
        int star = (int)(Math.random() * 5) + 2; //2~6
        System.out.println("star : " + star);
        for(int i=star; i>0; i--) {
            for(int z=1; z<=star; z++) {
                if(z<i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=star; i++) {
            for(int z=0; z<star; z++) {
                if(z < star - i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
