package collection;

public class Member2 implements Comparable<Member2> {
  private int memberId;
  private String memberName;

  public Member2(int memberId, String memberName){
    this.memberId=memberId;
    this.memberName=memberName;
  }

  @Override
  public String toString() {
    return memberName+" 회원님의 아이디는 "+memberId+" 입니다.";
  }

  public int getMemberId() {
    return memberId;
  }

  public void setMemberId(int memberId) {
    this.memberId = memberId;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public int hashCode(){
    return memberId;
  }

  @Override
  public boolean equals(Object o) {
    if(o instanceof Member2){
      Member2 member=(Member2) o;
      if(this.memberId==member.memberId){
        return true;
      }else{return false;}
    }
    return false;
  }

  @Override
  public int compareTo(Member2 member) {
    return (this.memberId-member.memberId);    // 오름차순
    //return (this.memberId-member.memberId)*-1; // 내림차순
  }

  public int compare(Member2 mem1,Member2 mem2){
    return mem1.getMemberId()-mem2.getMemberId();
  }
}
