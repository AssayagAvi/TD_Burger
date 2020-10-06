package refractor.api.general;

public interface FoodProduct extends Product, FoodConstituent {

     default double calories() {
          return weight() * calories_per_100g()/ 100;
     }

}
