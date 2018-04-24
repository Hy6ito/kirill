/** Трёхмерный класс точки */
public class Point3d {
	 /** X координата точки */
    private double xCoord;

    /** Y координата точки */
    private double yCoord;

    /** Z координата точки */
    private double zCoord;

    /** Конструктор, чтобы инициализировать точку (x, y, z) значение */
    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    /** Конструктор без параметров: значения по умолчанию к точке в источнике */
    public Point3d () {
        this.xCoord = 0.0;
        this.yCoord = 0.0;
        this.zCoord = 0.0;
    }

    /** Верните X координату точки */
    public double getX () {
        return xCoord;
    }

    /** Возвратите координату Y точки */
    public double getY () {
        return yCoord;
    }

    /** Верните Z координату точки */
    public double getZ () {
        return zCoord;
    }

    /** Набор X координат точки */
    public void setX (double val) {
        xCoord = val;
    }

    /** Набор координата Y точки */
    public void setY (double val) {
        yCoord = val;
    }

    /** Набор координата Z точки */
    public void setZ (double val) {
        zCoord = val;
	}

    /** Проверка на одинаковые точки */
    public boolean isEqual(Point3d that)
    {
    	if (this.xCoord == that.xCoord && this.yCoord == that.yCoord && this.zCoord == that.zCoord)
    		return true;
    	return false;
    }
    
    /** Вычисление расстояния */
    public double distanceTo(Point3d that) {
    	double dx = this.xCoord - that.xCoord;
        double dy = this.yCoord - that.yCoord;
        double dz = this.zCoord - that.zCoord;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

}
