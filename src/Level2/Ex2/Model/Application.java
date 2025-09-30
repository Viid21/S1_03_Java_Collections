package Level2.Ex2.Model;

import Level2.Ex1.Exceptions.ExceptionRepeatedRestaurant;

import java.util.*;

public class Application {
    static Set<Restaurant> restaurants = new HashSet<>();
    public void play(){
        for(int i = 0; i < 5; i++){
            createRestaurant("patata", i);
        }
        List<Restaurant> restaurantList = sortRestaurants();

        for(Restaurant restaurant : restaurantList){
            System.out.println("Name: " + restaurant.getName() + ", score: " + restaurant.getScore());
        }
    }

    public void createRestaurant(String name, int score){
        try{
            for(Restaurant restaurant : restaurants){
                if(restaurant.match(name,score)){
                    throw new ExceptionRepeatedRestaurant();
                }
            }
            restaurants.add(new Restaurant(name, score));
        }catch (ExceptionRepeatedRestaurant e){
            System.out.println(e.getMessage());
        }
    }

    public List<Restaurant> sortRestaurants(){
        List<Restaurant> restaurantsList = new ArrayList<>(restaurants);
        restaurantsList.sort(new Comparator<>() {
            @Override
            public int compare(Restaurant o1, Restaurant o2) {
                return Integer.compare(o2.getScore(), o1.getScore());
            }
        });
        return restaurantsList;
    }
}
