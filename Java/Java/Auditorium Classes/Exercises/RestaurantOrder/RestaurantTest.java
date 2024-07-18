public class RestaurantTest{
  public static void main(String[] args){
    Item manchurian = new Item("Manchurian", 40.00f, true, "Chinese");
    Item frenchFries = new Item("French Fries", 80.00f, true, "Italian");
    Item[] items = new Item[2];
    items[0] = manchurian;
    items[1] = frenchFries;
    
    Restaurant swagat = new Restaurant("Swagat", 4.2f, items);
    System.out.println(swagat.order(items));
    System.out.println("Your bill amount is: "+swagat.bill(items));
  }
}
