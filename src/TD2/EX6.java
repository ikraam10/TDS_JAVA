package TD2;
public class EX6 {
    public static void main(String[] args) {
        Disque d = new Disque(new Point(1,2), 3);
        Rectangle r = new Rectangle(5, 3);
        showDisque(d);
        showRectange(r);

        show(d);
        show(r);


    }
    static void show(Figure f){
        System.out.println("Perimeter: "+ f.getPerimeter() + " Air:"+ f.getAire());

    }

    static  void showDisque(Disque disque){
        System.out.println("Perimeter: "+ disque.getPerimeter() + " Air:"+ disque.getAire());
    }
    static  void showRectange(Rectangle  rectangle){

        System.out.println("Perimeter: "+ rectangle.getPerimeter() + " Air:"+ rectangle.getAire());

    }
}



abstract class Figure {
    public String nom;
    public Figure() {
    }

    public Figure(String nom) {
        this.nom=nom;
    }

    abstract public double getPerimeter();
    abstract public double getAire();

    @Override
    public String toString() {
        return "Figure{" +
                "nom='" + nom + '\'' +
                '}';
    }
}


 class Disque extends Figure {
    Point centre;
    double rayon;

    public Disque() {

    }

    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }


    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.rayon;
    }

    @Override
    public double getAire() {
        return Math.pow(this.rayon, 2) * 3.24;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}


class Rectangle extends Figure {
    private double longeur, largeur;
    public Rectangle() {

    }

    public Rectangle(double largeur, double longeur){
        this.largeur= largeur;
        this.longeur=longeur;
    }

    public Rectangle(double largeur, double longeur, String nom){
        super(nom);
        this.largeur= largeur;
        this.longeur=longeur;
    }
    @Override
    public double getPerimeter() {
        return 2* (this.longeur+ this.largeur);
    }

    @Override
    public double getAire() {
        return this.longeur + this.largeur;
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}

class Point3 {
    private double x,y;
    public Point3() {

    }
    public Point3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }}

