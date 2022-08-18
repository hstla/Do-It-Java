package exception;

import com.sun.security.jgss.GSSUtil;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest2 {
  public static void main(String[] args) {
    try(FileInputStream fis=new FileInputStream("a.txt")){

    }catch (IOException e){
      System.out.println(e);
    }
    System.out.println("end");
  }
}
