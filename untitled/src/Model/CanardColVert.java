package Model;


import StrategieInterface.BruitStrategie;
import StrategieInterface.VolerStrategie;

public class CanardColVert extends Canard {

    public CanardColVert(BruitStrategie faireBruit, VolerStrategie voler) {
        super(faireBruit, voler);
    }

    @Override
    public void affiche() {
        System.out.println("Bonjour, je suis un CanardColVert");
    }
}
