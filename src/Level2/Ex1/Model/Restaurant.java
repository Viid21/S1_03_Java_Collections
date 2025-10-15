package Level2.Ex1.Model;

import java.util.Objects;

public class Restaurant {
    String name;
    int score;

    public Restaurant(String nom, int score) {
        this.name = nom;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
