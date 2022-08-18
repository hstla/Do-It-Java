// stream은 한번만 사용이 가능하다.
package stream;

import java.util.Arrays;

public class IntArrayTest {
  public static void main(String[] args) {
    int[] arr=new int[]{1,2,3,4,5};

    //스트림 생성
    int sum=Arrays.stream(arr).sum();

    System.out.println(sum);
  }
}
