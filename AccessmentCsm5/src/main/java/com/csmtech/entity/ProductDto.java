package com.csmtech.entity;

public class ProductDto {
      private Long productId;
      private String productName;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", productName=" + productName + "]";
	}
      
}
