package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
  public static void main(String[] args) {
    FileInputStream fi=null;
    try{
      fi=new FileInputStream("a.txt");
    }catch (FileNotFoundException e){
      System.out.println(e);
    } finally {
      try{
        fi.close();
      }catch (IOException e){
        e.printStackTrace();
      }
      System.out.println("finally");
    }
    System.out.println("end");
  }
}
