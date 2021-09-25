class Election{
	public static int age = 18;
	public static void allow(String[] votes){
	System.out.println("inside allow method");
	 if (age>=18){
	   System.out.println("Eligible to vote");
	     if(votes!= null){
		getVoterIdDetails(votes);
	System.out.println("Person can vote");
	}
		else{
	System.out.println("Will not get voter id");
	}
	}
	else{
		System.out.println("Not Eligible to vote");
	      }
	   System.out.println("End of allow method");
	}
	
	public static void getVoterIdDetails(String[] votes){
	  for(int i=0; i <votes.length; i++){
		System.out.println(votes[i]);
	       }
	 }

}



















