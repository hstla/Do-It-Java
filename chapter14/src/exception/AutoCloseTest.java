// try-with-resources 문에는 close 자동으로 실행된다.
package exception;

public class AutoCloseTest {
  public static void main(String[] args) {
    try(AutoCloseObj obj=new AutoCloseObj()){
      throw new Exception();     // catch를 강제로 실행시킬때 throw
    }catch (Exception e){
      System.out.println("exception");
    }
  }
}