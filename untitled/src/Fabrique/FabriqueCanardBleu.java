package Fabrique;

import Decorateur.DecorateurCanard;
import Model.CanardBleu;
import StrategieInterface.BruitStrategie;
import StrategieInterface.VolerStrategie;

public class FabriqueCanardBleu implements FabriqueCanard{

    @Override
    public DecorateurCanard createCanard(BruitStrategie bruit, VolerStrategie vole) {
        return new DecorateurCanard(new CanardBleu(bruit, vole));
    }

}
