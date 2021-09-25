class PlanetUtil{
	public static void main(String a[]){
	Planets planet= new Planets();
	planet.planetName = "Mercury";
	planet.size = "smallest";
	planet.position = 1;
	planet.rotate();
	planet.displayPlanetsDetails();

	Planets planet2= new Planets();
	planet2.planetName = "Earth";
	planet2.size = "medium";
	planet2.position = 3;
	planet2.rotate();
	planet2.displayPlanetsDetails();

	Planets planet3= new Planets();
	planet3.planetName = "Jupiter";
	planet3.size = "largest";
	planet3.position = 5;
	planet3.rotate();
	planet3.displayPlanetsDetails();
}
	
}	