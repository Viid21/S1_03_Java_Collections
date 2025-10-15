package Level1.Ex1.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Application {
    List<Month> months = new ArrayList<>();
    public void play(){
        String[] names = {"January", "February", "March", "April", "May",
                "June", "July", "September", "October", "November", "December"};

        for(String name : names){
            months.add(new Month(name));
        }

        months.add(7, new Month("August"));

        System.out.println("ArrayList has the correct order:");
        for(Month month : months){
            System.out.println(month.getName());
        }

        months.add(7, new Month("August"));

        HashSet<Month> monthsHashSet = new HashSet<>(months);

        Iterator<Month> iterator = monthsHashSet.iterator();

        System.out.println("HashSet has no duplicates:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
