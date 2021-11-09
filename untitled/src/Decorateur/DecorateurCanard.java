package Decorateur;

import Model.Canard;

public class DecorateurCanard extends Canard{

    static int nombreCancanement = 0;
    private Canard canard;

    public DecorateurCanard(Canard canard) {
        super(canard.getFaireBruit(), canard.getVoler());
        this.canard = canard;
    }

    @Override
    public void cancane(){
        this.canard.cancane();
        this.augmenterCancement();
        this.nombreCancanement();
    }

    @Override
    public void vole(){
        this.canard.vole();
    }

    @Override
    public void affiche() {
        canard.affiche();
    }

    public final void augmenterCancement(){
        nombreCancanement++;
    }

    public final void nombreCancanement(){
        System.out.println(nombreCancanement);
    }

}
