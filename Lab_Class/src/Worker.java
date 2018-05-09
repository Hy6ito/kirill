/** Класс worker */
public class Worker {
	/** Фамилия и инициалы */
    private String name;
    /** Должность */
    private String post;
    /** Год поступления */
    private int year;
    /** Зарплата */
    private int salary;
    /** Инициализация работника */
    public Worker (String nm, String pt, int yr, int sl) {
    	name = nm;
    	post = pt;
    	year = yr;
    	salary = sl;
    }
    public String getName() {
    	return name;
    }
    public String getPost() {
    	return post;
    }
    public int getYear() {
    	return year;
    }
    public int getSalary() {
    	return salary;
    }

}