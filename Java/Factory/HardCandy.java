package Java.Factory;

import java.util.ArrayList;

public class HardCandy extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> hardCandyPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            HardCandy hardCandy = new HardCandy();
            hardCandyPackage.add(hardCandy);
        }

        System.out.println("One package of " + quantity + " hardCandy has been made!");
        return hardCandyPackage;
    }

}
