package TD3;

 class Batiment {
    private String adresse;

    public Batiment() {

    }
    public Batiment( String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}


class Maison extends Batiment{
    int nbChambres;

    public Maison() {

    }
    public Maison(int nbChambres, String adresse){
        super(adresse);
        this.nbChambres = nbChambres;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbChambres=" + nbChambres +
                '}';
    }
}


class Immeuble extends Batiment{
    int nbAppart;

    public Immeuble() {

    }

    public Immeuble(int nbAppart, String adresse) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "nbAppart=" + nbAppart +
                '}';
    }
}

