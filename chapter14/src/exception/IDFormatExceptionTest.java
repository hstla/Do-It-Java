package exception;

public class IDFormatExceptionTest {
  private String userID;

  public void setUserID(String userID) throws IDFormatException{
    if (userID ==null){
      throw new IDFormatException("아이디는 null일 수 없습니다.");
    }else if(userID.length()<8||userID.length()>20){
      throw new IDFormatException("아이디는 8자 이상 20자 이하입니다.");
    }
  }

  public String getUserID() {
    return userID;
  }

  public static void main(String[] args){
    IDFormatExceptionTest idTest=new IDFormatExceptionTest();
    String userID=null;

    try{
      idTest.setUserID(userID);
    }catch (IDFormatException e){
      System.out.println(e);
    }
    userID="1234567";
    try{
      idTest.setUserID(userID);
    }catch (IDFormatException e){
      System.out.println(e);
    }
  }
}