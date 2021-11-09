package Fabrique;

import Model.*;
import StrategieInterface.*;

public class FabriqueCanardColVert implements FabriqueCanard{

    @Override
    public CanardColVert createCanard(BruitStrategie bruit, VolerStrategie vole) {
        return new CanardColVert(bruit, vole);
    }

}
