package TD3;

public class EX3 {
    public static void main(String[] args) {

        Centre centre = new Centre(2, 2, 'A');
        centre.affiche(); //2 2, Nom : A
        Centre cercle = new Cercle(8, 9 , 'B');
        cercle.affiche(); //Coordonnees : 8 9, Nom : B




    }
}

class Point2 {
    private int x,y;
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public void affCoord() {
        System.out.println("Coordonnees : " + getX() + " " + getY());
    }

    public void affiche() {
        System.out.println("Coordonnees : " + getX() + " " + getY());
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


class Centre extends Point {
    char nom;

    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }
    public void affNom() {
        System.out.println("nom = "+nom);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + super.getX() + " " + super.getY() + ", Nom : " +nom);
    }

}


class Cercle extends Centre {

    public Cercle(int x, int y, char nom) {
        super(x, y, nom);
    }
}

