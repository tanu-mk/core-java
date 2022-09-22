class TorchTester{

	public static void main(String a[]){
	
	System.out.println("Main method Started");
	
		Torch.brandName = "Philips";
		Torch.color = "Red";
		Torch.price = 320;
		
		Torch.onOrOff();
		
		Torch.onOrOff();
		
		Torch.onOrOff();
		
	System.out.println("Main method ended");
	
	
	System.out.println("Torch brand is "+Torch.brandName);
	System.out.println("Price of Torch is "+Torch.price);
	System.out.println("Torch color is "+Torch.color);
	}


}