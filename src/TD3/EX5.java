package TD3;

 class Vehicule {
    private int nbPassger;
    public Vehicule(int n) {
        this.nbPassger = n;

    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbPassger=" + nbPassger +
                '}';
    }
}


 class Avion extends Vehicule{
    private int nbrMoteur;

    public Avion(int nPr) {
        super(nPr);
    }

    public Avion(int nPr, int nbrMoteur) {
//        super(nPr);
        this(nPr);
        this.nbrMoteur = nbrMoteur;
    }

}


class Moto extends Vehicule{
    private int nbRoues = 2;

    public Moto(int n, int nbRoues) {
        super(n);
        this.nbRoues = nbRoues;
    }
    public Moto(int n ) {
        super(n);
    }
}


class Triporteur extends Moto{
    public Triporteur(int n) {
        super(n, 3);
    }
}

