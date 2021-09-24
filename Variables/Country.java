class Country{
 public static void main(String a[]){

  String  []countryName = new String[5];
         countryName[0] = "INDIA";
	countryName[1] = "CHINA";
	countryName[2] = "Sri Lanka";
	countryName[3] = "RUSSIA";
	countryName[4] = "USA";


 int[] noOfStates = new int[5];
	noOfStates[0] = 29;
	noOfStates[1] = 11;
	noOfStates[2] = 34;
	noOfStates[3] = 45;
	noOfStates[4] = 23;
  
  String listOfCapitals[]={"New Delhi","Colombo","London","Dunno","Nevermind"};
 System.out.println(countryName[0] + " "+countryName[1]+ " "+countryName[2]+ " "+countryName[3]+ " "+countryName[4]);
 System.out.println(noOfStates[0]+ " "+noOfStates[1]+ " "+noOfStates[2]+ " "+noOfStates[3]+ " "+noOfStates[4]);
System.out.println(listOfCapitals[0]+ " "+listOfCapitals[1]+ " "+listOfCapitals[2]+ " "+listOfCapitals[3]+ " "+listOfCapitals[4]);
}

}