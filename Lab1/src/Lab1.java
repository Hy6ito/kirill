import java.util.Scanner;

public class Lab1 {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		/** ���� ��������� 3 ����� */
		System.out.println("������� ���������� ����� 1(x,y,z): ");
		double x1 = in.nextDouble(); double y1 = in.nextDouble(); double z1 = in.nextDouble();
		System.out.println("������� ���������� ����� 2(x,y,z): ");
		double x2 = in.nextDouble(); double y2 = in.nextDouble(); double z2 = in.nextDouble();
		System.out.println("������� ���������� ����� 3(x,y,z): ");
		double x3 = in.nextDouble(); double y3 = in.nextDouble(); double z3 = in.nextDouble();
		
		/** �������� �������� �� ������� */
		Point3d fst = new Point3d(x1,y1,z1);
		Point3d scn = new Point3d(x2,y2,z2);
		Point3d thr = new Point3d(x3,y3,z3);
		
		/** �������� �� ���������� ����� */
		if (fst.isEqual(scn) || fst.isEqual(thr) || scn.isEqual(thr)) {
			System.out.println("��� ����� ��������!");
		}
		else {
			double ans = computeArea(fst,scn,thr);
			ans = Math.round(ans*10)/10.0; // ���������� �� 1 ����� ����� �������
			System.out.println("������� ������: " + ans);
		}
	}

	/** ������� ����� �� 3 ������ */
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
    	double p = (a.distanceTo(b)+b.distanceTo(c)+c.distanceTo(a))/2;
        return Math.sqrt(p*(p-a.distanceTo(b))*(p-b.distanceTo(c))*(p-c.distanceTo(a)));
    }
}