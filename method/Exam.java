
class Exam{
	public static String universityName = "VTU";
	public static int fees = 1350;

	public static void allow(String[] hallTicket){
	System.out.println("Inside allow method");
	
 	if(fees > 1000){
	System.out.println("Fees is paid show me the hallTicket");
	    if(hallTicket != null){
	
	getHallTicketDetails(hallTicket);
	System.out.println("Allowed to write Exam");
	}
	else{
	System.out.println("No Hallticket Found");
	}
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