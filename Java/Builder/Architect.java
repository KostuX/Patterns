package Java.Builder;

import java.awt.Color;
import java.awt.Dimension;

public class Architect {

    public static void main(String[] args) {

        Bedroom room = new Bedroom(new Dimension(200, 100), 132, 2, Color.yellow, 2, 1, true, true);

        Bedroom newRoom = new BedroomBuilder()
                .setCeilingHeight(132)
                .setDimensions(new Dimension(100, 200))
                .createBedroom();

        System.out.println(newRoom.toString());
    }

}
