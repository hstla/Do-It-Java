// sout, main
package object;

import java.util.Arrays;
import java.util.Objects;

class MyDate{
  int day;
  int month;
  int year;

  public MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyDate myDate = (MyDate) o;
    return day == myDate.day && month == myDate.month && year == myDate.year;
  }

  @Override
  public int hashCode() {
    return day * 10 + month * 101 + year * 102;
  }
}

public class MyDateTest {
  public static void main(String[] args) {
    MyDate date1=new MyDate(9,18,2004);
    MyDate date2=new MyDate(9,18,2004);
    System.out.println(date1.equals(date2));

    System.out.println(date1.hashCode());
    System.out.println(date2.hashCode());

    System.out.println("str1의 실제주소값 :" + System.identityHashCode(date1));
    System.out.println("str2의 실제주소값 :" + System.identityHashCode(date2));

  }
}
