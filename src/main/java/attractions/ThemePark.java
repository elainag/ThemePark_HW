package attractions;

import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> attractions;
    private ArrayList<IReviewed> stalls;
    private ArrayList<IReviewed> allReviews;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.allReviews = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviews() {
        return allReviews;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return allReviews;
    }
}
