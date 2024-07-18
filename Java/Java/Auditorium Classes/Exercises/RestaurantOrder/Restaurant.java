public class Restaurant{
  public String name;
  public float stars;
  public Item[] menu_items;
  Restaurant(String name, float stars, Item[] menu_items){
    this.name = name;
    this.stars = stars;
    this.menu_items = menu_items;
  }
  public boolean order (Item[] i){
    System.out.println("Order Received");
    return true;
  }
  public float bill(Item[] i){
    float sum = 0;
    for(int j=0; j<i.length; j++){
      sum+=i[j].price;
    }
    return sum;
  }
}
