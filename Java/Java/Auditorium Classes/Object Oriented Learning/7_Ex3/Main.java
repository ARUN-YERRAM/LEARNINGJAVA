public class Main {
    public static void main(String[] args) {
        PlayerRating p = new PlayerRating(1, "Oscar");
        p.calculateAverageRating(1, 1, 1);
        p.calculateCategory();
        p.display();
    }
}
