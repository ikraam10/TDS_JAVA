package TD2;

class Point {
    private int x,y;

    public Point(int x, int y) {
    }

    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x+= dx;
        y+= dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class PointA extends Point{
    public PointA(int x, int y) {
        super(x,y);
    }
    public void affiche() {
        System.out.println("coordonnees  du point : ("+getX()+", "+getY());
    }
}


public class EX1 {
    public static void main(String[] args) {
        Point point = new Point(2 , 4);
        point.deplace(1,1);
        System.out.println(point.getX()+", "+ point.getY()); //1, 1

        Point pointA = new PointA(5,8);
        pointA.deplace(2,2);
        System.out.println(pointA.getX()+", "+ pointA.getY()); //2, 2




    }
}

