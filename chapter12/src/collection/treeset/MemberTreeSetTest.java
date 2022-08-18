// Id가 같아 중복안됨, Member클래스에 compareTo를 설정해줘야 실행된다.
package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
  public static void main(String[] args) {
    MemberTreeSet memberTreeSet=new MemberTreeSet();

    Member memberPark=new Member(1003,"박서훤");
    Member memberLee=new Member(1001,"이지원");
    Member memberSon=new Member(1002,"손민국");

    memberTreeSet.addMember(memberLee);
    memberTreeSet.addMember(memberSon);
    memberTreeSet.addMember(memberPark);
    memberTreeSet.showAllMember();

    Member memberHong=new Member(1003,"홍길동");
    //memberHong.setMemberId(1005);
    memberTreeSet.addMember(memberHong);
    memberTreeSet.showAllMember();
  }
}