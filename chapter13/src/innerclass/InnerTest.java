// static을 잘 알면 쉽게 이해할 수 있다.
// 내부클래스는 static 사용못함.
package innerclass;

class OutClass{
  private int num=0;
  private static int sNum=20;
  InClass inClass;

  public OutClass() {
    inClass=new InClass();
  }

  private class InClass{
    int inNum=200;
    // static sInNum = 100; static은 사용못함
    void inTest(){
      System.out.println(num);
      System.out.println(sNum);
    }
  }

  public void usingInTest(){
    inClass.inTest();
  }

  //static 외부클래스에 상관없이 사용가능
  static class InStaticClass{
    int iNum=100;
    static int sInNum=200;

    void inTest(){
      //num+=10;
      sNum+=10;   //static 변수는 사용가능
      System.out.println(sNum);
      System.out.println(iNum);
      System.out.println(sInNum);
    }

    static void sTest(){
      System.out.println(sNum);
      System.out.println(sInNum);
    }

  }
}
public class InnerTest {
  public static void main(String[] args) {
    OutClass outClass=new OutClass();
    outClass.usingInTest();
    System.out.println("====================================");
    OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
    sInClass.inTest();
    System.out.println("====================================");
    OutClass.InStaticClass.sTest();

  }
}

