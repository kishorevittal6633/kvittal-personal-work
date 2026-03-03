package com.current.app.dao;

import java.util.ArrayList;
import java.util.List;

import com.current.app.dto.Contract;
import com.current.app.dto.Vehicle;
import com.current.app.service.VehicleService;

public class VehicleDao implements VehicleService {

	@Override
	public List<Vehicle> fetchVehicleList(String market) {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		// DB operation to retrieve vehicle list by passing the market info
		// returns Vehicle details
		
		return vehicleList;
	}
	
	public void createVehicleOrder(Vehicle vehicle) {
		// DB operation to create a vehicle order
	}
	
	public void createContract(Contract contract) {
		// DB operation to create a contract for the vehicle
	}

}
