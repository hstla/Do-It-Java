package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//stream을 class로 구현
class CompareString implements BinaryOperator<String>{
  @Override
  public String apply(String s1, String s2) {
    if(s1.getBytes().length <= s2.getBytes().length){
      return s1;
    } else {
      return s2;
    }
  }
}

public class ReduceTest {
  public static void main(String[] args) {
    String[] greetings=new String[]{"안녕하세요를레히요","hello","Good morning","반갑습니다람쥐"};
    // stream을 함수로 구현
    System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->{
      if(s1.getBytes().length >= s2.getBytes().length){
        return s1;} else{return s2;}}));

    String str= Arrays.stream(greetings).reduce(new CompareString()).get();
    System.out.println(str);
  }
}
