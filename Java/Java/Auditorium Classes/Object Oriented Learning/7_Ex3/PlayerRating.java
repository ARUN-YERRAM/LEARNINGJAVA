public class PlayerRating{
    public int playerPosition;
    public String playerName;
    public float criticOneRating;
    public float criticTwoRating;
    public float criticThreeRating;
    public float averageRating;
    public char category;

    PlayerRating(int playerPosition, String playerName){
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }
    public void calculateAverageRating(float c1, float c2, float c3){
        this.averageRating = (c1+c2+c3)/3.0f;
    }
    public void calculateAverageRating(float c1, float c2){
        this.averageRating = (c1+c2)/2.0f;
    }
    public void calculateCategory(){
        this.category = (this.averageRating>8)?'A':(this.averageRating>5)?'B':'C';
    }
    public void display(){
        System.out.println("The player name is : "+this.playerName);
        System.out.println("The player's Position is : "+this.playerPosition);
        System.out.println("The player's average rating is : "+this.averageRating);
        System.out.println("The player's category is : "+this.category);
    }
}