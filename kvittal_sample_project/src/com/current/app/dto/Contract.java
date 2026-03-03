/**
 * 
 */
package com.current.app.dto;

/**
 * 
 */
public class Contract {
	
	private long contractId;
	
	private Vehicle vehicle;
	
	private Customer customer;

	public long getContractId() {
		return contractId;
	}

	public void setContractId(long contractId) {
		this.contractId = contractId;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
