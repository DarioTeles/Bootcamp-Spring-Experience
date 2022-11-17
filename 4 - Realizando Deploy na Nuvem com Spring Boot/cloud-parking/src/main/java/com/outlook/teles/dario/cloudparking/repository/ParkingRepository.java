package com.outlook.teles.dario.cloudparking.repository;

import com.outlook.teles.dario.cloudparking.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {

}
