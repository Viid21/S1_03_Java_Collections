package Level1.Ex1.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Application {
    ArrayList<Month> months = new ArrayList<>();
    public void play(){
        StringBuilder s = new StringBuilder();
        String[] names = {"January", "February", "March", "April", "May",
                "June", "July", "September", "October", "November", "December"};

        for(String name : names){
            months.add(new Month(name));
        }

        months.add(7, new Month("August"));

        for(int i = 0; i < months.size(); i++){
            s.append((i != (months.size() - 1)) ? months.get(i).getName() + ", " : months.get(i).getName() + ".");
        }

        System.out.println(s);

        HashSet<Month> monthsHashSet = new HashSet<>(months);

        for(String name : names){
            monthsHashSet.add(new Month(name));
        }

        Iterator<Month> iterator = monthsHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
