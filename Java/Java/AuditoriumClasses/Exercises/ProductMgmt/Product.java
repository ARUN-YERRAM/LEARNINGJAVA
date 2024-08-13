public class Product implements Comparable{
    /*name, rating, price
    default price
    option to sort it via name or rating or number of purchase also*/

    public String name;
    public float rating;
    public float price;
    public int numOfPurchases;

    Product(String name, float rating, float price, int numOfPurchases) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.numOfPurchases = numOfPurchases;
    }

    @Override
    public int compareTo(Object o) {
        Product p = (Product) o;
        return (int)(this.price - p.price);
    }

    @Override
    public String toString(){
        return "Name: "+this.name+"; Rating: "+this.rating+"; Price: "+this.price+"; Number of Purchases: "+this.numOfPurchases;
    }
}
