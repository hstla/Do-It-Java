// 생성자 연습, 생성자 오버로드
public class PersonTest {
  public static void main(String[] args){
    Person personKim=new Person();
    personKim.name="김유신";
    personKim.weight=85.5f;
    personKim.height=180.0f;
  }
  Person personLee=new Person("이순신",175,75);
}
