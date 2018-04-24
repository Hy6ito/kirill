/** ��������� ����� ����� */
public class Point3d {
	 /** X ���������� ����� */
    private double xCoord;

    /** Y ���������� ����� */
    private double yCoord;

    /** Z ���������� ����� */
    private double zCoord;

    /** �����������, ����� ���������������� ����� (x, y, z) �������� */
    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    /** ����������� ��� ����������: �������� �� ��������� � ����� � ��������� */
    public Point3d () {
        this.xCoord = 0.0;
        this.yCoord = 0.0;
        this.zCoord = 0.0;
    }

    /** ������� X ���������� ����� */
    public double getX () {
        return xCoord;
    }

    /** ���������� ���������� Y ����� */
    public double getY () {
        return yCoord;
    }

    /** ������� Z ���������� ����� */
    public double getZ () {
        return zCoord;
    }

    /** ����� X ��������� ����� */
    public void setX (double val) {
        xCoord = val;
    }

    /** ����� ���������� Y ����� */
    public void setY (double val) {
        yCoord = val;
    }

    /** ����� ���������� Z ����� */
    public void setZ (double val) {
        zCoord = val;
	}

    /** �������� �� ���������� ����� */
    public boolean isEqual(Point3d that)
    {
    	if (this.xCoord == that.xCoord && this.yCoord == that.yCoord && this.zCoord == that.zCoord)
    		return true;
    	return false;
    }
    
    /** ���������� ���������� */
    public double distanceTo(Point3d that) {
    	double dx = this.xCoord - that.xCoord;
        double dy = this.yCoord - that.yCoord;
        double dz = this.zCoord - that.zCoord;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

}
