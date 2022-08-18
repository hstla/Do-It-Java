package object;

class Student {
  int studentId;
  String studentName;

  public Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
  }

  @Override
  public boolean equals(Object obj) {  // equals override 논리적 동일롤 재정의
    if (obj instanceof Student) {
      Student std = (Student) obj;
      if (this.studentId == std.studentId) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return studentId+","+studentName;
  }

  @Override
  public int hashCode() {
    return studentId;
  }
}

public class EqualsTest {
  public static void main(String[] args) {
    Student str1=new Student(100,"abc");
    Student str2=new Student(100,"abc");

    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));  // 논리적 동일

    Integer i1;
    i1 = new Integer(100);
    Integer i2=new Integer(100);

    System.out.println(i1==i2);
    System.out.println(i1.equals(i2));

    System.out.println("str1의 hashCode :" + str1.hashCode());
    System.out.println("str2의 hashCode :" + str2.hashCode());

    System.out.println("str1의 실제주소값 :" + System.identityHashCode(str1));
    System.out.println("str2의 실제주소값 :" + System.identityHashCode(str2));
  }
}
