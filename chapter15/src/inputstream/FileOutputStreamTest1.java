package inputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
  public static void main(String[] args) {
    try(FileOutputStream fos=new FileOutputStream("output.txt",true)){ // true 작성하면 이어서 쓰기
      fos.write(65);
      fos.write(66);
      fos.write(67);
    } catch (IOException e){
      e.printStackTrace();
    }
    System.out.println("출력이 완료되었습니다.");
  }
}
