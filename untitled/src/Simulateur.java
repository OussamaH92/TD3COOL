import Fabrique.FabriqueCanardBleu;
import Fabrique.FabriqueCanardColVert;
import Fabrique.FabriqueCanardPlastique;
import Model.*;
import StrategieImpl.BruitBIIP;
import StrategieImpl.BruitCOOOIN;
import StrategieImpl.VolerNON;
import StrategieImpl.VolerOUI;

class Simulateur
{
	public static void main(String[] args)
	{

		FabriqueCanardBleu fabriqueCanardBleu = new FabriqueCanardBleu();
		FabriqueCanardPlastique fabriqueCanardPlastique = new FabriqueCanardPlastique();
		FabriqueCanardColVert fabriqueCanardColVert = new FabriqueCanardColVert();


		Canard[] canards = new Canard[3];
		canards[0] = fabriqueCanardColVert.createCanard(new BruitCOOOIN(),new VolerOUI());
		canards[1] = fabriqueCanardBleu.createCanard(new BruitCOOOIN(), new VolerOUI());
		canards[2] = fabriqueCanardPlastique.createCanard(new BruitBIIP(),new VolerNON());

		for (Canard canard : canards)
			simule(canard);
	}

	private static void simule(Canard c)
	{
		c.affiche();
		c.cancane();
		c.nage();
		c.vole();

	}
}
