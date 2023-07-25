
public class Veggie implements Burger {

	private double price;
	private String description;
	

	
	public Veggie(String description, double price) {
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