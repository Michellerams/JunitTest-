
public class BeefBurger implements Burger{
	

	private double price;
	private String description;
	
	public BeefBurger(double price, String description) {
		this.price = price;
		this.description = description;
	}
	
	@Override
	public double getPrice() {
		return price;	
	}
	@Override
	public String getDescription() {
		return description;
		
		
	}

}
