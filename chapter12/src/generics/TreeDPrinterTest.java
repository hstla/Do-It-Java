// 제네릭 프로그램방식
package generics;

public class TreeDPrinterTest {
  public static void main(String[] args) {
    // T는 컴파일러가 Object로 자동변환해준다.
    TreeDPrinter<Powder> printer=new TreeDPrinter<Powder>(); // <>사이에 자료형(클래스) 넣기
    printer.setMaterial(new Powder());
    System.out.println(printer);
    printer.printing();

    TreeDPrinter<Plastic> plastic=new TreeDPrinter<Plastic>();
    plastic.setMaterial(new Plastic());
    System.out.println(plastic);
    plastic.printing();

//    예외처리되었다.
//    TreeDPrinter<Water> printWater=new TreeDPrinter<Water>();
//    printWater.setMaterial(new Water());
//    System.out.println(printWater);
  }
}
