package question4.model;

import java.util.Objects;

public class Product {
	
	private String productName;
	private int productPrice;
	
    public Product() {
		
	}
    public Product(String productName,int productPrice) {
		
		this.productName=productName;
		this.productPrice=productPrice;
}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [ productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	
	}
	@Override
	public int hashCode() {
		return Objects.hash(productName, productPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productName, other.productName) && productPrice == other.productPrice;
	}    
}