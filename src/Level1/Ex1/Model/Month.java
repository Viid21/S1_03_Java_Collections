package Level1.Ex1.Model;

import java.util.Objects;

public class Month {
    String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null||getClass()!=o.getClass()){
            return false;
        }
        Month month = (Month) o;
        return Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
