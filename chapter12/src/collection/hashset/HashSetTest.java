//HashSet은 중복하고 순서가 없다.
package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
  public static void main(String[] args) {
    HashSet<String> hashSet=new HashSet<String>();
    hashSet.add(new String("임정순"));
    hashSet.add(new String("박현정"));
    hashSet.add(new String("홍연의"));
    hashSet.add(new String("강감찬"));
    hashSet.add(new String("강감찬"));

    System.out.println(hashSet);
  }
}
