class CountCharacter{

	public static void main(String t[]){
	
		String string = "The best of both words";
		int count = 0;
		
		for(int i=0; i<string.length(); i++){
			
			if(string.charAt(i)!= '')
			count++;
		
		}
		
	System.out.println("Total number of characters in a string: "+ count);
	
	
	}

}