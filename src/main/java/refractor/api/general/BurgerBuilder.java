package refractor.api.general;

import java.util.ArrayList;
import java.util.List;

import refractor.api.general.Meat.MenuSize;
import refractor.api.general.Meat.MeatType;
import refractor.api.general.Sauce.SauceType;



public abstract class BurgerBuilder {
    protected final List<FoodProduct> products;
    protected final String name;

    public abstract double littleMeatPortion();
    public abstract double mediumMeatPortion();
    public abstract double bigMeatPortion();
    public abstract double cheesePortion();
    public abstract double onionPortion();
    public abstract double saucePortion();
    public abstract double tomatoPortion();


    public BurgerBuilder(String name, MeatType type ,MenuSize size) {
        this.name = name;
        this.products = new ArrayList<>();
        this.products.add(new Meat(type,this.getBurgerWeight(size)));
    }

    public BurgerBuilder Onion(){
        this.products.add(new DeepFriedOnions(this.onionPortion()));
        return this;
    }
    public BurgerBuilder Tomato(){
        this.products.add(new Tomato(this.tomatoPortion()));
        return this;
    }

    public BurgerBuilder Cheese(){
        this.products.add(new Cheddar(this.cheesePortion()));
        return this;
    }
    public BurgerBuilder Sauce(SauceType flavor){
        this.products.add(new Sauce(flavor,this.saucePortion()));
        return this;
    }

    public double getBurgerWeight(MenuSize size){
       double weight;
        switch (size) {
            case LITTLE:
                weight =this.littleMeatPortion();
                break;
            case MEDIUM:
                weight = this.mediumMeatPortion();
                break;
            case BIG:
            default:
                weight = this.bigMeatPortion();
        }
        return weight;
    }



    public Burger cook (){
        return new Burger(this.name, this.products);
    }
}
