package collection.arraylist;
import collection.Member;
import java.util.ArrayList;

public class MemberArrayList {
  private ArrayList<Member> arrayList;

  public MemberArrayList(){
    arrayList=new ArrayList<Member>();
  }

  public void addMember(Member member){
    arrayList.add(member);
  }

  public boolean removeMember(int memberId){
    for(int i=0;i<arrayList.size();i++){
      Member member=arrayList.get(i);
      int tmpId=member.getMemberId();
      if(memberId==tmpId){
        arrayList.remove(i);
        return true;
      }
    }
    System.out.println(memberId+"가 존재하지 않습니다.");
    return false;
  }

  public void showAll(){
    for(Member member: arrayList){
      System.out.println(member);
    }
//    System.out.println(arrayList);
  }

  public void insertMember(Member member, int index){
    arrayList.add(index,member);
  }
}
