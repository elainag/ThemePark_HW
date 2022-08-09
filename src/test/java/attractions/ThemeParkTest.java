package attractions;

import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor1 = new Visitor(25, 180, 50.50);
        visitor2 = new Visitor(10, 120, 5.50);
    }

    @Test
    public void canGetAllIReviews(){
        ArrayList<IReviewed> allReviews = new ArrayList<>();
        allReviews.add(dodgems);
        allReviews.add(park);
        allReviews.add(playground);
        allReviews.add(rollerCoaster);
        assertEquals(allReviews.size(), themePark.getAllReviewed(allReviews).size());
    }
}
