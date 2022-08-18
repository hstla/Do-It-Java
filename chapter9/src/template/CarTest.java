package template;

// 템플릿 메서드는 final로 선언하고 실행순서, 즉 시나리오를 정의한 메서드이므로 바뀔 수 없다.
public class CarTest {
  public static void main(String[] args){
    System.out.println("====== 자율주행 자동차=====");
    Car myCar=new AICar();
    myCar.run();
    System.out.println("====== 사람이 운전하는 자동차=====");
    Car hisCar=new ManualCar();
    hisCar.run();
  }
}
