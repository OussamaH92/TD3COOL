package Fabrique;

import Model.*;
import StrategieInterface.*;

public class FabriqueCanardPlastique implements FabriqueCanard{

    @Override
    public CanardPlastique createCanard(BruitStrategie bruit, VolerStrategie vole) {
        return new CanardPlastique(bruit, vole);
    }

}
