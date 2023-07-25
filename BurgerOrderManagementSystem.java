
public class BurgerOrderManagementSystem {

	public static void main(String[] args) {
		
		BurgerFactory obj=new BurgerFactory();
	    obj.createBurger(BurgerType.BEEF);
	    Order obj1=new Order(BurgerType.BEEF, 2, 50.7,"" );
	    System.out.println(Order.getOrderDetails());
		 
	}

	
}
