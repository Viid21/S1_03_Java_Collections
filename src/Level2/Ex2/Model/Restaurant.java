package Level2.Ex2.Model;

public class Restaurant {
    String name;
    int score;

    public Restaurant(String nom, int score) {
        this.name = nom;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public boolean match(String name, int score){
        return this.name.equals(name) && this.score == score;
    }
}
