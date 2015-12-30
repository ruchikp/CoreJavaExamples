package com.digitek.encapsulation;

public class CustomerOrder {
	
	
	private String custName;
	
	private String custOrder;
	
	private String custAddress;
	
	private int custOrderQuantity;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustOrder() {
		return custOrder;
	}

	public void setCustOrder(String custOrder) {
		this.custOrder = custOrder;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public int getCustOrderQty() {
		return custOrderQuantity;
	}

	public void setCustOrderQty(int custOrderQty) throws Exception {
		if(custOrderQty<=0) {
			throw new Exception("Invalid value for qty");
		}
		this.custOrderQuantity = custOrderQty;
	}
	
}
