import java.util.Scanner;
 class ElectionUtil1{
	public static void main(String a[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age");
	String age = sc.next();
	String value = Election.vote(Integer.parseInt(age));
	System.out.println(value);
	}
}