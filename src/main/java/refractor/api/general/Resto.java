package refractor.api.general;

import refractor.api.general.Meat.MeatType;
import refractor.api.general.Meat.MenuSize;

public interface Resto {
    public enum RestoType{
        POOR, RICH;
    }

    public BurgerBuilder commandeMenu(Menu choice);
    public BurgerBuilder commandePersonalise(String name, MeatType type, MenuSize size);


}
