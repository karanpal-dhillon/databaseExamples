package com.spring.database.vehicle.dao;

import com.spring.database.vehicle.domain.Vehicle;

public interface VehicleDAO {
	void insert(Vehicle vehicle);

	void update(Vehicle vehicle);

	void delete(Vehicle vehicle);

	Vehicle findByVehicelNo(String vehicleNo);
}
