// 클래스에서 인터페이스를 구현하다. Calculator는 인터페이스의 모든 메소드를 구현하지 않아서 추상클래스가 됨.
// 인터페이스를 상속하는 것은 타입(type)상속이다.
package interfaceex;

public abstract class Calculator implements Calc{ //implements 뒤에는 여러개의 인터페이스가 올 수 있다.

  @Override
  public int add(int num1, int num2) {
    return num1+num2;
  }

  @Override
  public int substract(int num1, int num2) {
    return num1-num2;
  }
}
