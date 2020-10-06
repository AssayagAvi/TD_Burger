package refractor.api.general;

import refractor.api.general.Meat.MenuSize;
import refractor.api.general.Meat.MeatType;
import refractor.api.general.Sauce.SauceType;

public class PoorResto implements Resto {
    @Override
    public BurgerBuilder commandeMenu(Menu choice) {
        BurgerBuilder commande = null;
        switch (choice){
            case VIANDE:
                commande = new PoorBurgerBuilder("Beefy",MeatType.BEEF,MenuSize.MEDIUM)
                        .Sauce(SauceType.BURGER)
                        .Onion()
                        .Cheese();
                break;
            case POISSON:
                commande = new PoorBurgerBuilder("Fishy", MeatType.WHITEFISH,MenuSize.LITTLE)
                        .Sauce(SauceType.BEARNAISE);
                break;
            case FROMAGE:
                commande = new PoorBurgerBuilder("Cheesy", MeatType.BEEF,MenuSize.LITTLE)
                        .Cheese();
                break;
            default:
        }

        return commande;
    }

    @Override
    public BurgerBuilder commandePersonalise(String name, Meat.MeatType type, Meat.MenuSize size) {
        return new PoorBurgerBuilder(name, type, size);
    }
}
