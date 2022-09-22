class SuperMarket{

   static String superMarketName;
   static String vegetables[] = {"Potato","Tomato","Carrot","Cauliflower","Ladies Finger","Heere Kai"};
   static String perfumes[] = {"Fogg","Yardley","Tulip","Axe","Secret","WildStone","Engage","Sweet Heart"};
   
   public static void main(String a[]){
   
   superMarketName = "Reliance Mart";
   
   System.out.println("Welcome to "+ superMarketName);
   
   System.out.println("List of Vegetables");
   
   for(int z=0; z<vegetables.length; z++){
	   
	   System.out.println(vegetables[z]);
	  
   }
   System.out.println("***************************");
   
   System.out.println("List of Perfumes");
   
   for( int z=1;z < perfumes.length; z++){
	   
	   System.out.println(perfumes[z] + " ");
	   
   }
   
  
   
  }
  
}