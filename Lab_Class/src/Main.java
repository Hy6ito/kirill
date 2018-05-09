import java.util.Scanner;
import java.util.Calendar;

public class Main {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		/** Создание и ввод массива класса */
		String name, post, curpt;
		int year, salary, i, exp, cursl;
		System.out.print("Введите количество работников: ");
		int qnt = in.nextInt();
		Worker[] work = new Worker[qnt];
		for (i = 0; i < qnt; i++) {
			System.out.println("\tРаботник " + i);
			in.nextLine();
			System.out.print("Фамилия и инициалы: ");
			name = in.nextLine();
			System.out.print("Должность: ");
			post = in.next();
			System.out.print("Год поступления: ");
			year = in.nextInt();
			System.out.print("Зарплата: ");
			salary = in.nextInt();
			work[i] = new Worker(name,post,year,salary);
		}
		System.out.println("\n1) список работников, стаж работы которых на данном\r\n" +
				" предприятии превышает заданное число лет:");
		System.out.print("Введите стаж работы: ");
		exp = in.nextInt();
		for (i = 0; i < qnt; i++) {
			if (cal.get(Calendar.YEAR) - work[i].getYear() > exp) {
				System.out.println(work[i].getName());
			}
		}
		System.out.println("\n2) список работников, зарплата которых больше заданной:");
		System.out.print("Введите зарплату: ");
		cursl = in.nextInt();
		for (i = 0; i < qnt; i++) {
			if (work[i].getSalary() > cursl) {
				System.out.println(work[i].getName());
			}
		}
		System.out.println("\n3) список работников, занимающих заданную должность:");
		System.out.print("Введите должность: ");
		curpt = in.next();
		for (i = 0; i < qnt; i++) {
			if (work[i].getPost().equals(curpt)) {
				System.out.println(work[i].getName());
			}
		}
	}

}