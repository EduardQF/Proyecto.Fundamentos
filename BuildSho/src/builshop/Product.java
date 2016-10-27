package builshop;

public class Product {
private String id;
	private String code;
	private String name;
	private int cost;
	private int price;
	private int stock;

	public Product(String id, String code, String name, String cost, String price, String stock) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.cost = Integer.valueOf(cost);
		this.price = Integer.valueOf(price);
		this.stock = Integer.valueOf(stock);
	}
	

	public void setID(String s) {
		id = s;
	}

	public String getID() {
		return id;
	}

	public void setCode(String s) {
		code = s;
	}

	public String getCode() {
		return code;
	}

	public void setName(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void setCost(int s) {
		cost = s;
	}

	public int getCost() {
		return cost;
	}

	public void setPrice(int s) {
		price = s;
	}

	public int getPrice() {
		return price;
	}

	public void setStock(int s) {
		stock = s;
	}

	public int getStock() {
		return stock;
	}

}

