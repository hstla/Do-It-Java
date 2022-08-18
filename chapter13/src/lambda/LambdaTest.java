package lambda;

interface PrintString{
  void showString(String str);
}

public class LambdaTest {
  public static void main(String[] args) {
    PrintString lambdaPrint=str-> System.out.println(str); //함수를 변수처럼 사용
    lambdaPrint.showString("test");

    showMyString(lambdaPrint);

    PrintString reStr= retrunPPrint();
    reStr.showString("test3");
  }
  public static void showMyString(PrintString lambda){
    lambda.showString("test2");
  }

  public static PrintString retrunPPrint(){
    return s-> System.out.println(s+" world");
  }
}