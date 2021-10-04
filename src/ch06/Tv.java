package ch06;

public class Tv {
    private String brand;
    //private는 다이렉트로 값을 바꾸는게 아니라 다른 경로를 통해 들어가고 나가게한다.
    private int inch;
    //위에 내용까지만 적은 상태에서 마우스 오른쪽클릭 generate 들어가서 getters and setters로 작업가능

    public void setBrand(String brand) { //들어오는통로 setters
        this.brand = brand; //String brand로 값을 받고 함수 끝나기 전에 주소값을 밀어넣어줌
    }

    public String getBrand() { //getters 나가는 통로
        return this.brand;
    }

    public void setInch(int inch){
        this.inch = inch;
    }

    public int getInch() {
        return this.inch;
    }

    //getters, setters
}
