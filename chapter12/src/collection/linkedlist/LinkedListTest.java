package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<String> myList=new LinkedList<String>();

    myList.add("A");
    myList.add("B");
    myList.add("C");

    System.out.println(myList);

    myList.add(1,"D");
    System.out.println(myList);

    myList.addFirst("o");
    System.out.println(myList);

    System.out.println(myList.removeLast());  //삭제한 링크 return
    System.out.println(myList);
  }
}
