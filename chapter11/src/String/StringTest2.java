// String객체는 final선언되어 불변하다. 객체끼리 합치려면 새로운 객체가 생성된다.
package String;

public class StringTest2 {
  public static void main(String[] args) {
    String javaStr=new String("java");
    String andridStr=new String("android");
    System.out.println(javaStr);
    System.out.println("처음 문자열 주소 값: "+ System.identityHashCode(javaStr));

    javaStr=javaStr.concat(andridStr);

    System.out.println(javaStr);
    System.out.println("연결된 문자열 주소 값: "+ System.identityHashCode(javaStr));

  }
}
