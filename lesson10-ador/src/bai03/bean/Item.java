package bai03.bean;

import java.math.BigDecimal;

public class Item {

	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer storeId;
	
	public Item() {
	}

	public Item(Integer id, String name, BigDecimal price, Integer storeId) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.storeId = storeId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", storeId=" + storeId + "]\n";
	}
}
