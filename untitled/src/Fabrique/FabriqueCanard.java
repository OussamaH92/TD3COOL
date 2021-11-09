package Fabrique;

import Model.*;
import StrategieInterface.BruitStrategie;
import StrategieInterface.VolerStrategie;

public interface FabriqueCanard {

    Canard createCanard(BruitStrategie bruit, VolerStrategie vole);

}
