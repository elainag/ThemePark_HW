package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double doubleFee(Visitor visitor) {
        if (visitor.getHeight() > 200){
            return defaultPrice() * 2;
        }else {
            return defaultPrice();
        }
    }
}
