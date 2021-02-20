package model.entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
		
	}
	
	public OrderItem(Integer quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
		
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return price *quantity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getProduct().getName());
		sb.append(", R$");
		sb.append(getPrice());
		sb.append(", Quantity: ");
		sb.append(getQuantity());
		sb.append(", Subtotal: ");
		sb.append(subTotal());
		return sb.toString();
		
		//return "OrderItem [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}
	
	
	
	
	
	

}
