package String;

public class StringTest1 {
  public static void main(String[] args) {
    String str1=new String("abc");
    String str2=new String("abc");
    //내용이 같아도 객체를 생성하면 다른 힙메몰리를 가르킨다.
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));  // 논리적 동일하다.

    String str3="abc";
    String str4="abc";
    //객체를 생성하지 않으면 abc 라는 상수 풀을 가르킨다.
    System.out.println(str3==str4);
    System.out.println(str3.equals(str4));
  }
}
