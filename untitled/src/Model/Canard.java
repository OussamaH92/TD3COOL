package Model;

import StrategieInterface.BruitStrategie;
import StrategieInterface.VolerStrategie;

public abstract class Canard {

    private BruitStrategie faireBruit;
    private VolerStrategie voler;

    public Canard(BruitStrategie faireBruit, VolerStrategie voler) {
        this.faireBruit = faireBruit;
        this.voler = voler;
    }

    public void vole(){
        this.voler.voler();
    }
    public void cancane(){
        this.faireBruit.faireBruit();
    }

    public final void nage(){
        System.out.println("Bonjour, je nage");
    }

    public void setFaireBruit(BruitStrategie faireBruit) {
        this.faireBruit = faireBruit;
    }

    public void setVoler(VolerStrategie voler) {
        this.voler = voler;
    }

    public BruitStrategie getFaireBruit() {
        return faireBruit;
    }

    public VolerStrategie getVoler() {
        return voler;
    }

    public abstract void affiche();
}
