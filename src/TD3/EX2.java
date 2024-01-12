package TD3;
public class EX2 {
    public static void main(String[] args) {

        PointNom pointNom = new PointNom(5,8, 'A');
        pointNom.setNom('C');
        pointNom.setPointNom(2,2,'V');
        pointNom.affCoordNom(); //10 16, Nom : V




    }
}


class Point1 {
    private int x,y;
    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + getX() + " " + getY());
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


class PointNom extends Point1 {
    private char nom;

    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void setPointNom(int x, int y, char nom) {
        super.deplace( super.getX(),  super.getY());
        this.nom = nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + super.getX() + " " + super.getY() + ", Nom : " + nom);
    }
}


