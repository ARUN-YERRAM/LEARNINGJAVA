import java.util.Comparator;
public class NumPurchasesFilter implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Product p1 = (Product) o1;
        Product p2 = (Product) o2;

        return (int)(p1.numOfPurchases - p2.numOfPurchases);
    }
}
