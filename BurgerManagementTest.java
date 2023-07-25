import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

public class BurgerManagementTest {

	@Test
	public void testBeef() {
		//myObj is the object created from the beefBurger class,the class in which the functions are in
		BeefBurger myObj=new BeefBurger(50.7, "Beef burger");
		double out=myObj.getPrice();
		String out1=myObj.getDescription();
	//third parameter is delta - the maximum delta between expected and actual for which both numbers are still considered equal.
		assertEquals(50.7,out,0.1);
		assertEquals("Beef burger",out1);
				
	}
	@Test
	public void testChicken() {
		//myObj is the object created from the JunitTesting class
		Chicken myObj1=new Chicken("chicken burger", 30.5);
		double output=myObj1.getPrice();
		String output1=myObj1.getDescription();
		
		assertEquals(30.5,output,0.1);
		assertEquals("chicken burger",output1);
				
}
	
	@Test
	public void testVeggie() {
		//myObj is the object created from the JunitTesting class
		Veggie myObj=new Veggie("Veggietable burger", 40.5);
		double obj=myObj.getPrice();
		String obj1=myObj.getDescription();
		
		assertEquals(40.5,obj,0.1);
		assertEquals("Veggietable burger",obj1);
				
	}
	@Test
	public void testBurgerFactory() {
		BurgerFactory bf=new BurgerFactory();
		bf.createBurger(BurgerType.BEEF );
	
		
		
	}
	@Test
	public void testTotal() {
	Order o=new Order(BurgerType.CHICKEN, 3, 30.5, "\"Order [Burger=\" + Burger + \", getQuantity()=\" + quantity + \", price=\" +price;");
	double tp=o.getTotalPrice();
	int qt=o.getQuantity();
	assertEquals(3,qt);
	assertEquals(91.0,tp,0.1);
	}
	@Test
	public void testOrder() {
		Order o=new Order(BurgerType.BEEF, 1, 50.7,"\"Order [Burger=\" + Burger + \", getQuantity()=\" + quantity + \", price=\" +price;");
		
		String de=o.getOrderDetails();
		assertEquals("Order [Burger=BEEF, quantity=1, price=50.7",de);
	}
	@Test
	public void testCreateOrder() {
		
		BurgerOrderManagementSystem boms= new BurgerOrderManagementSystem();
		boms.main(null);
		
	}
}
 