// 예외처리 미루기
package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
  public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
    FileInputStream fis=new FileInputStream(fileName);
    Class c=Class.forName(className);
    return c;
  }

  public static void main(String[] args) {
    ThrowsException ex=new ThrowsException();
    try {
      ex.loadClass("b.txt","java.lang.String");
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (ClassNotFoundException e) {
      System.out.println(e);
    } catch (Exception e){      // 뭔지 모를 때 상위 클래스인 exception 으로 처리
      System.out.println(e);
    }
    System.out.println("end");

  }
}
