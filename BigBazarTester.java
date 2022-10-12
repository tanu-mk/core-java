class BigBazarTester{

	public static void main(String t[]){              //instance variable can be acessed with the help of reference variable
	                                                   // static member '' '' '' of className 
		BigBazar bb = new BigBazar();
		
		bb.location = "Bangalore";
		bb.contactNo = 890890s8908L;
		bb.noOfWorkers = 45;
		bb.gstinNo = "GSTIN17MK05";
		
		System.out.println(bb.location + " "+ bb.contactNo + " "+ bb.noOfWorkers + " "+ bb.gstinNo);
		
		BigBazar big = bb;
		System.out.println(big.location + " "+ big.contactNo + " "+ big.noOfWorkers + " "+ big.gstinNo );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}








}