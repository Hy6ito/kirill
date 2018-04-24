import java.util.Scanner;

public class Palindrome {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		String s = in.nextLine();
		if (isPalindrome(s))
			System.out.println("yes");
		else
			System.out.println("no");
			
	}
	//строка наоборот
	public static String reverseString(String s) {
		String d = "";
		for (int i = s.length()-1; i>=0; i--) {
			d += s.charAt(i);
		}
		return d;
	}
	//Проверка на палиндром
	public static boolean isPalindrome(String s) {
		String d = reverseString(s);
		if (s.equals(d))
			return true;
		else
			return false;
	}
	

}
