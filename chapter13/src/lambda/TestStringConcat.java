package lambda;

public class TestStringConcat {
  public static void main(String[] args) {
    StringConcatImp1 sImp1=new StringConcatImp1();
    sImp1.makeString("heelo" ,"java");

    //람다식 구현(함수형 인터페이스) 휠씬 간단하다.
    StringConcat concat= (s1,s2)-> System.out.println(s1+","+s2);
    concat.makeString("hello","java");
  }
}