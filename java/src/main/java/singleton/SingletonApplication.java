package singleton;

public class SingletonApplication {
    public static void main(String[] args) {
        King king = King.getInstance();
        king.say();
        King king2 = King.getInstance();
        if(king == king2) System.out.println("Same King");
        else System.out.println("Another King");
    }
}
