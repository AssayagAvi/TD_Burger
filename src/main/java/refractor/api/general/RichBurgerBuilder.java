package refractor.api.general;

import refractor.api.general.Meat.MenuSize;
import refractor.api.general.Meat.MeatType;

public class RichBurgerBuilder extends BurgerBuilder {

    public RichBurgerBuilder(String name, MeatType type, MenuSize size) {
        super(name, type, size);
    }

    @Override
    public double littleMeatPortion() {
        return 100;
    }

    @Override
    public double mediumMeatPortion() {
        return 200;
    }

    @Override
    public double bigMeatPortion() {
        return 400;
    }

    @Override
    public double cheesePortion() {
        return 10;
    }

    @Override
    public double onionPortion() {
        return 20;
    }

    @Override
    public double saucePortion() {
        return 10;
    }

    @Override
    public double tomatoPortion() {
        return 30;
    }
}
