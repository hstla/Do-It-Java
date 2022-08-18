package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
  public static void main(String[] args) {

    ArrayList<String> sList=new ArrayList<String>();
    sList.add("Tomas");
    sList.add("james");
    sList.add("Edward");

    Stream<String> stream = sList.stream();
    stream.forEach(s-> System.out.println(s));

    //sorted()는 오름차순으로 Comparable 되어있다.
    sList.stream().sorted().forEach(s-> System.out.println(s));
  }
}
