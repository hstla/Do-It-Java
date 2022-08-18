// 추상클래스는 인스턴스를 생성할 수 없다.

public class ComputerTest {
  public static void main(String[] args){
    //Computer c1=new Computer();
    Computer c2=new DeskTop();
    //Computer c3=new NoteBook();
    Computer c4=new MyNoteBook();

    c2.display();
    c4.turnOff();
    c4.typing();

  }
}
