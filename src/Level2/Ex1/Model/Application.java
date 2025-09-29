package Level2.Ex1.Model;

import Level2.Ex1.Exceptions.ExceptionRepeatedRestaurant;

import java.util.HashSet;
import java.util.Set;

public class Application {
    static Set<Restaurant> restaurants = new HashSet<>();
    public void play(){
        System.out.println(createRestaurant("patata", 2));
        System.out.println(createRestaurant("patata", 2));
    }

    public String createRestaurant(String name, int score){
        try{
            for(Restaurant restaurant : restaurants){
                if(restaurant.match(name,score)){
                    throw new ExceptionRepeatedRestaurant();
                }
            }
            restaurants.add(new Restaurant(name, score));
            return "A restaurant has been created.";
        }catch (ExceptionRepeatedRestaurant e){
            return e.getMessage();
        }
    }
}
