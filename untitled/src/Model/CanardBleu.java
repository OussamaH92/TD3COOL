package Model;


import StrategieInterface.BruitStrategie;
import StrategieInterface.VolerStrategie;

public class CanardBleu extends Canard {

    public CanardBleu(BruitStrategie faireBruit, VolerStrategie voler) {
        super(faireBruit, voler);
    }

    @Override
    public void affiche() {
        System.out.println("Bonjour, je suis un CanardBleu");
    }
}
