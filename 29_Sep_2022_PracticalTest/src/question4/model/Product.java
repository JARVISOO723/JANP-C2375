package question4.model;

import java.util.Objects;

public class Product {
	
	private String productName;
	private int productPrice;
	private int productId;

	
    public Product() {
		
	}
    public Product(String productName,int productPrice,int productId) {
		
		this.productName=productName;
		this.productPrice=productPrice;
		this.productId=productId;

}
	
	
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public int getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int hashCode() {
		return Objects.hash(productId, productName, productPrice);
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
		return productId == other.productId && Objects.equals(productName, other.productName)
				&& productPrice == other.productPrice;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + ", productId=" + productId
				+ "]";
	}
	
}