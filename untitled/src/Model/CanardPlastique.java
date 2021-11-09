package Model;


import StrategieInterface.BruitStrategie;
import StrategieInterface.VolerStrategie;

public class CanardPlastique extends Canard {

    public CanardPlastique(BruitStrategie faireBruit, VolerStrategie voler) {
        super(faireBruit, voler);
    }

    @Override
    public void affiche() {
        System.out.println("Bonjour, je suis un CanardPlastique");
    }

}
