package lambda;

public class TestMyNumber {
  public static void main(String[] args) {
    MyNumber maxNum=(x,y)-> (x >= y)?x:y;     //구현
    int max=maxNum.getMaxNumber(10,20);
    System.out.println(max);
  }

}
