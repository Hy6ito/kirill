/** двумерный класс точки */
public class Point2d {

    /** X координата точки */
    private double xCoord;

    /** Y координата точки */
    private double yCoord;

    /**  онструктор, чтобы инициализировать точку (x, y) значение. */
    public Point2d (double x, double y) {
        xCoord = x;
        yCoord = y;
    }
/**  онструктор без параметров: значени€ по умолчанию к точке в источнике. */
    public Point2d () {
        //¬ызовите конструктор с двум€ параметрами и определите источник.
        this (0, 0);
    }

    /** ¬ерните X координату точки. */
    public double getX () {
        return xCoord;
    }

    /** ¬озвратите координату Y точки. */
    public double getY () {
        return yCoord;
    }

    /** Ќабор X координат точки. */
    public void setX (double val) {
        xCoord = val;
    }

    /** Ќабор координата Y точки. */
    public void setY (double val) {
        yCoord = val;
    }
}
