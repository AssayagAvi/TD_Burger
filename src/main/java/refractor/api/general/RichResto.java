package refractor.api.general;

import refractor.api.general.Meat.MenuSize;
import refractor.api.general.Meat.MeatType;
import refractor.api.general.Sauce.SauceType;

public class RichResto implements Resto{
    @Override
    public BurgerBuilder commandeMenu(Menu choice) {
        BurgerBuilder commnande = null;
        switch (choice) {
            case VIANDE:
                commnande = new RichBurgerBuilder("Big Marcel", MeatType.BEEF, MenuSize.BIG)
                        .Sauce(SauceType.BURGER)
                        .Onion()
                        .Tomato();
                break;

            case POISSON:
                commnande = new RichBurgerBuilder("FiletO'Poisson", MeatType.WHITEFISH, MenuSize.MEDIUM)
                        .Sauce(SauceType.BEARNAISE);
                break;

            case FROMAGE:
                commnande = new RichBurgerBuilder("MaxeeCheese", MeatType.BEEF, MenuSize.MEDIUM)
                        .Cheese()
                        .Onion();
                break;
            case PERSO:
        }
        return commnande;
    }

    @Override
    public BurgerBuilder commandePersonalise(String name, MeatType type, MenuSize size) {
        return new RichBurgerBuilder(name,type,size);
    }
}
