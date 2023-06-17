package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Producto producto;
	
	public OrderItem() {	
		
	}
	public OrderItem(Integer quantity, Double price, Producto producto) {

		this.quantity = quantity;
		this.price = price;
		this.producto = producto;
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

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Double subTotal() {
		return quantity * price;
	}
	@Override
	public String toString() {
		return producto.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity
				+ ", Subtotal: $" + String.format("%.2f", subTotal());
	}
	
	
}
