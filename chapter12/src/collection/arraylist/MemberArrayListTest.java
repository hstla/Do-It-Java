package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
  public static void main(String[] args) {
    MemberArrayList memberArrayList=new MemberArrayList();
    Member memberLee=new Member(101,"이순신");
    Member memberKim=new Member(102,"김유신");
    Member memberShin=new Member(103,"신사임당");
    Member memberGwang=new Member(104,"황현성");

    memberArrayList.addMember(memberLee);
    memberArrayList.addMember(memberKim);
    memberArrayList.addMember(memberShin);
    memberArrayList.insertMember(memberGwang,2);

    memberArrayList.showAll();

    memberArrayList.removeMember(101);
    System.out.println("================================");
    memberArrayList.showAll();


  }
}
