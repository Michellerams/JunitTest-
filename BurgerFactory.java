
public class BurgerFactory {
	 static void createBurger(BurgerType Type) {
		 
		int quantity=2;
		double price=57.0;
        int total=(int) (price*quantity);
	    System.out.println("quantity : " + quantity);
		System.out.println("Burger Type: " + BurgerType.BEEF );
		System.out.println("Price of beef burger: " + price);
	    System.out.println("Total :" + total);
		
		
			
		
		
	
	}


}
