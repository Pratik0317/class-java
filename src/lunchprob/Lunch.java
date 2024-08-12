package lunchprob;

public class Lunch {

	private String lunchName;
	private Integer quantity;
	private Integer price;
	
	public Lunch(String lunchName, Integer quantity, Integer price) {
		this.lunchName = lunchName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Lunch() {
		
	}

	public String getLunchName() {
		return lunchName;
	}

	public void setLunchName(String lunchName) {
		this.lunchName = lunchName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
