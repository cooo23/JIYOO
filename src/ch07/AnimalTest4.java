package ch07;

public class AnimalTest4 {
    Animal ani = new Cat();
    Cat cat = (Cat)ani;
    BigCat bc = (BigCat)cat;// 여기서 문제, BigCat이 하위개체이기 때문에 못가리킨다.//Animal, Cat, Object 가능
    //bc.sleep();
}
