package innerclass;

class Outer{
  int outNum=100;
  static int sNum=200;

  public Runnable getRunnable(int i){
    int localNum=100;
    return new Runnable(){
      public void run(){
        //localNum+=100; 변수의 유효성 지역변수는 final로 선언된다.
        System.out.println(outNum);
        System.out.println(sNum);
        System.out.println(localNum);
      }
    };
  }

}
public class LocalInnerTest {
  public static void main(String[] args) {
    Outer outer=new Outer();
    Runnable runnable=outer.getRunnable(20);
    runnable.run();
  }
}