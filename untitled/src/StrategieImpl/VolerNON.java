package StrategieImpl;

import StrategieInterface.VolerStrategie;

public class VolerNON implements VolerStrategie {

    @Override
    public void voler() {
        System.out.println("Bonsoir, non");
    }
}
