package com.current.app.service;

import java.util.List;

import com.current.app.dto.Contract;
import com.current.app.dto.Vehicle;

public interface VehicleService {
	
	public List<Vehicle> fetchVehicleList(String market);
	
	public void createVehicleOrder(Vehicle vehicle);
	
	public void createContract(Contract contract);

}
