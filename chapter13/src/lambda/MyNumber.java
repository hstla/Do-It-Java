package lambda;
//함수형 인터페이스의 메소드는 하나만 선언

@FunctionalInterface
public interface MyNumber {
  int getMaxNumber(int x, int y);
}