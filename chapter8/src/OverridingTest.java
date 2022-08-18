public class OverridingTest {
  public static void main(String[] args){
    Customer customerLee=new Customer(10010,"LEE");
    int price=customerLee.calcprice(10000);
    System.out.println("지불금액은 "+price+"이고, "+customerLee.showCustomerInfo());

    VIPCustomer customerKim=new VIPCustomer(10010,"Kim",100);
    price=customerKim.calcprice(10000);
    System.out.println("지불금액은 "+price+"이고, "+customerKim.showCustomerInfo());

    Customer customerGold=new GoldCustomer(10010,"김유신");
  }
}
