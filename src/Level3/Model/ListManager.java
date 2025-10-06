package Level3.Model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListManager {
    public static Comparator<Client> descendantName = new Comparator<Client>() {
        @Override
        public int compare(Client c1, Client c2) {
            return c1.getName().compareTo(c2.getName());
        }
    };

    public static Comparator<Client> ascendantName = new Comparator<Client>() {
        @Override
        public int compare(Client c1, Client c2) {
            return c2.getName().compareTo(c1.getName());
        }
    };

    public static Comparator<Client> descendantSurnames = new Comparator<Client>() {
        @Override
        public int compare(Client c1, Client c2) {
            return c1.getSurnames().compareTo(c2.getSurnames());
        }
    };

    public static Comparator<Client> ascendantSurnames = new Comparator<Client>() {
        @Override
        public int compare(Client c1, Client c2) {
            return c2.getSurnames().compareTo(c1.getSurnames());
        }
    };

    public static Comparator<Client> descendantId = new Comparator<Client>() {
        @Override
        public int compare(Client c1, Client c2) {
            return c1.getId().compareTo(c2.getId());
        }
    };

    public static Comparator<Client> ascendantId = new Comparator<Client>() {
        @Override
        public int compare(Client c1, Client c2) {
            return c2.getId().compareTo(c1.getId());
        }
    };

    public static Comparator<Client> getDescendantName(){
        return descendantName;
    }

    public static Comparator<Client> getAscendantName(){
        return ascendantName;
    }

    public static Comparator<Client> getAscendantId() {
        return ascendantId;
    }

    public static Comparator<Client> getAscendantSurnames() {
        return ascendantSurnames;
    }

    public static Comparator<Client> getDescendantId() {
        return descendantId;
    }

    public static Comparator<Client> getDescendantSurnames() {
        return descendantSurnames;
    }

    public static List<Client> clientsListBuilder(List<String> lines){
        List<Client> clientsList = new ArrayList<>();

        for(String line : lines){
            String[] parts = line.split(",");
            clientsList.add(new Client(parts[0], parts[1], parts[2]));
        }

        return clientsList;
    }
}
