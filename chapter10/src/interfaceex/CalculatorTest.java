package interfaceex;

public class CalculatorTest {
  public static void main(String[] args){
    int num1=10;
    int num2=5;

    CompleteCalc calc=new CompleteCalc();
    // Calc calcs=new CompleteCalc();                타입상속
    System.out.println(calc.add(num1,num2));
    System.out.println(calc.substract(num1,num2));
    System.out.println(calc.times(num1,num2));
    System.out.println(calc.divide(num1,num2));
    calc.showInfo();
    calc.description();

    int[] arr = {1,2,3,4,5};
    int sum=Calc.total(arr);
    System.out.println(sum);
  }
}