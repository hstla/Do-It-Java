// 자바 가상 메서드 원리와 같이 buyer.order();은 customer의 order()함수가 실행된다.
package interfaceex;

public class CustomerTest {
  public static void main(String[] args){
    Customer customer=new Customer();
    Buy buyer= customer;
    buyer.buy();
    buyer.order();

    Sell seller=customer;
    seller.sell();
    seller.order();

    if(seller instanceof Customer){
      Customer customer2=(Customer)seller;
      customer2.buy();
      customer2.sell();
    }
    customer.order();
  }
}
