package refractor.api.general;

import refractor.api.general.Meat.MenuSize;
import refractor.api.general.Meat.MeatType;

public class PoorBurgerBuilder extends BurgerBuilder {

    public PoorBurgerBuilder (String name, MeatType type, MenuSize size){
        super(name,type,size);
    }

    @Override
    public double littleMeatPortion() {
        return 50;
    }

    @Override
    public double mediumMeatPortion() {
        return 100;
    }

    @Override
    public double bigMeatPortion() {
        return 200;
    }

    @Override
    public double cheesePortion() {
        return 15;
    }

    @Override
    public double onionPortion() {
        return 10;
    }

    @Override
    public double saucePortion() {
        return 40;
    }

    @Override
    public double tomatoPortion() {
        return 10;
    }
}
