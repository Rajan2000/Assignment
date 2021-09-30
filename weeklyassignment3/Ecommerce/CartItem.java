package com.databaseschema;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CartItem")
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartItem_id;
	private Integer quantity;
	private Double price;
	public Integer getCartItem_id() {
		return cartItem_id;
	}
	public void setCartItem_id(Integer cartItem_id) {
		this.cartItem_id = cartItem_id;
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
	
}