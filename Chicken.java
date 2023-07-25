
public class Chicken implements Burger {

	private double price;
	private String description;
	

	
	public Chicken(String description, double price) {
		this.description = description;
		this.price = price;
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
