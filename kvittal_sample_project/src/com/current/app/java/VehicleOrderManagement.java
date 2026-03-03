package com.current.app.java;

import java.util.ArrayList;
import java.util.List;

import com.current.app.dto.Contract;
import com.current.app.dto.Customer;
import com.current.app.dto.Vehicle;
import com.current.app.service.VehicleService;

/*
 * This class is assumed to be the base Java class called from the UI layer 
 * 
 * to connect to the DB to perform CRUD operations for populating the front end screens
 * 
 */

public class VehicleOrderManagement {
	
	/**
	 * Initializing manually to avoid DI and trigger the service class 
	 * 
	 * to execute the base class to retrieve calls from DAO
	 * 
	 */
	private VehicleService vehicleService;

	/**
	 * Method to return the list of available vehicles
	 * 
	 * @param market
	 * @return
	 */
	public List<Vehicle> fetchVehicleList(String market) {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList = vehicleService.fetchVehicleList(market);
		System.out.println(vehicleList);
		
		return null;
	}
	
	/**
	 * Method to create a vehicle order 
	 * 
	 */
	public void createVehicleOrder() {
		Vehicle vehicle = new Vehicle();
		vehicleService.createVehicleOrder(vehicle);
	}

	/**
	 * Method to create a contract for the customer against the selected/purchased vehicle
	 * 
	 */
	public void createContract() {
		Customer customer = new Customer();
		Vehicle vehicle = new Vehicle();
		Contract contract = new Contract();
		contract.setCustomer(customer);
		contract.setVehicle(vehicle);
		
		vehicleService.createContract(contract);
	}
	
	public VehicleService getVehicleService() {
		return vehicleService;
	}

	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

}
