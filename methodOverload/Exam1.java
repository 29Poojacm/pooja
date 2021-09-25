
class Exam1{
	public static String universityName = "VTU";
	public static int fees = 1350;

	public static void allow(String[] hallTicket){
	System.out.println("inside allow method with hallTicket");
	  if(hallTicket != null){
	
	getHallTicketDetails(hallTicket);
	System.out.println("allow to write exam");
	}
	else{
	System.out.println("No Hallticket Found");
       }
	System.out.println("end of allow method");
	}
	public static void allow(int fees){
	if(fees>1000){
	
	System.out.println("Fees is paid show me the hallTicket");
	}
	else{
	System.out.println("please pay the fees");
	}
	System.out.println("end allow method");
	}
	public static void getHallTicketDetails(String[] hallTicket){
	for(int i=0; i < hallTicket.length; i++){
	System.out.println(hallTicket[i]);
	}
       }
      }