package Level3.Model;

public class Client {
    String name;
    String surnames;
    String id;

    public Client(String name, String surnames, String id) {
        this.name = name;
        this.surnames = surnames;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return name + "   " + surnames + "   " + id;
    }
}
