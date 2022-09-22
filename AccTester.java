class AccTester{

	public static void main(String a[]){
	
		Acc.brandName = "Samsung";
		Acc.color = "white";
		Acc.price = 38000;
		Acc.maxTemperature = 7;
	   
		
	Acc.onOrOff();	
	Acc.increaseTemperature();
	Acc.increaseTemperature();
	Acc.increaseTemperature();
	Acc.increaseTemperature();
	Acc.increaseTemperature();
	Acc.decreaseTemperature();
	Acc.decreaseTemperature();
	Acc.decreaseTemperature();
	Acc.decreaseTemperature();
	Acc.onOrOff();
	
	Acc.increaseTemperature();
	Acc.increaseTemperature();
	Acc.increaseTemperature();
	Acc.increaseTemperature();
	Acc.decreaseTemperature();
	Acc.onOrOff();
	}
}