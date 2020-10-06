package refractor.api.general;

public class Meat implements FoodProduct {

    public enum MeatType {
        BEEF, WHITEFISH;
        // BEEF : 200 kcal / 100g
        // WHITEFISH : 170 kcal / 100g

        public double calories_per_100g() {
            double rtr;
            switch (this) {
                case WHITEFISH:
                    rtr = 170.0;
                    break;
                case BEEF:
                default:
                    rtr = 200.0;
            }
            return rtr;
        }

        public double price() {
            double rtr;
            switch (this) {
                case WHITEFISH:
                    rtr = 6.0;
                    break;
                case BEEF:
                default:
                    rtr = 4.0;
            }
            return rtr;
        }
    }

    public enum MenuSize {
        LITTLE, MEDIUM, BIG
    }

    @Override
    public double calories_per_100g() {
        return this.type.calories_per_100g();
    }


    private MeatType type;
    private double weight;

    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }



    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }
}
