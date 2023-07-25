
public class Order {
private static  BurgerType Burger;
private static   int quantity ;
private static  double price;
private static  String details;

//constructor
public Order(BurgerType burger, int quantity,double price,String details) {
	Burger = burger;
	this.quantity = quantity;
	this.price=price;
	this.details=details;
}


//getters and setters
public BurgerType getBurger() {
	return Burger;
}
public void setBurger(BurgerType burger) {
	Burger = burger;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


//public methods
public double getTotalPrice() {
	return price=(int) (price*quantity);

	//price*quantity;
}
public static String getOrderDetails() {
		return "Order [Burger=" + Burger + ", quantity=" + quantity + ", price=" +price;

}


}