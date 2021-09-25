import java.util.Scanner;
class ExamUtil2{
	static String[] hallTicket=new String[3];
  public static void main(String a[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Candidate Name");
	String candidateName= sc.next();
	System.out.println("Enter the USN No");
	String usnNo= sc.next();
	System.out.println("Enter the Subject Name");
	String subject = sc.next();
	      hallTicket[0]= candidateName;
	      hallTicket[1]= usnNo;
	      hallTicket[2]= subject;
	System.out.println("main method started");
	Exam1.allow(hallTicket);
	Exam1.allow(1300);
	System.out.println("main method ended");
	}
}	