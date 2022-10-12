class SoapTester{

	public static void main(String t[]){
	
	
//ClassName refe = new ClassName();	
	Soap soap = new Soap();
	
	soap.name = "Mysore Sandal";
	soap.shape = "oval";
	soap.price = 78;
    soap.color ="cream";
	
	 soap.toGetFresh();
	 
	 
	 Soap soap1 = new Soap();
	
	soap1.name = "Fiama"; 
	soap1.shape = "Rectangle";
	soap1.price = 68;
    soap1.color ="white";
	
	soap.toGetFresh();
	
	
	Soap sp = new Soap();
	
	sp.name = "Himalaya";
	sp.shape = "Round";
	sp.price = 65;
	sp.color = "Green";

     soap.toGetFresh(); 	
	
	
	
	
	
	}





}