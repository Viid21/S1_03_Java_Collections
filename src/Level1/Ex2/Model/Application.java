package Level1.Ex2.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Application {
    public void play(){
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            firstList.add(i + 1);
        }

        ListIterator<Integer> it = firstList.listIterator(firstList.size());

        while(it.hasPrevious()){
            secondList.add(it.previous());
        }

        System.out.println(firstList);
        System.out.println(secondList);
    }
}

