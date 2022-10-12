class SolarSystemTester{

	public static void main(String t[]){
	
		SolarSystem planet = new SolarSystem();
		
		planet.name = "Mercury";
		planet.madeUpOf = "Oxygen, Sodium , Hydrogen";
		planet.feature = "fastest planet";
		
		System.out.println(planet.name + " "+ planet.madeUpOf + " "+ planet.feature);
		
		SolarSystem planet1 = new SolarSystem();
		
		planet1.name = "Venus";
		planet1.madeUpOf = "Carbon Dioxide";
		planet1.feature = "Hottest planet";
		
		System.out.println(planet1.name + " "+ planet1.madeUpOf + " "+ planet1.feature);
		
		SolarSystem planet2 = new SolarSystem();
		
		planet2.name = "Earth";
		planet2.madeUpOf = "Nitrogen , oxygen";
		planet2.feature = "Largest planet";
		
		System.out.println(planet2.name + " "+ planet2.madeUpOf + " "+ planet2.feature);
		
		SolarSystem planet3 = new SolarSystem();
		
		planet3.name = "Mars";
		planet3.madeUpOf = "Argon , Carbon dioxide , nitrogen";
		planet3.feature = "Red planet";
		
		System.out.println(planet3.name + " "+ planet3.madeUpOf + " "+ planet3.feature);
	
	
		SolarSystem planet4 = new SolarSystem();
		
		planet4.name = "Jupiter";
		planet4.madeUpOf = "Water and Ammonia";
		planet4.feature = "Largest planet";
		
		System.out.println(planet4.name + " "+ planet4.madeUpOf + " "+ planet4.feature);
	
	
	
	
	
	
	
	
	
	
	}









}