//Member 클래스의 equals 메서드를 재정의해야 중복안됨.
package collection.hashset;

import collection.Member;

public class MeberHashSetTest {
  public static void main(String[] args) {
    MemberHashSet memberhashset=new MemberHashSet();

    Member memberLee=new Member(1001,"이지원");
    Member memberSon=new Member(1002,"손민국");
    Member memberPark=new Member(1003,"박서훤");

    memberhashset.addMember(memberLee);
    memberhashset.addMember(memberSon);
    memberhashset.addMember(memberPark);
    memberhashset.showAllMember();

    Member memberHong=new Member(1003,"홍길동");
    memberhashset.addMember(memberHong);
    memberhashset.showAllMember();
  }
}
