package com.rafcojan.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafcojan.entities.Tour;


@Repository
public interface TourRepo extends JpaRepository<Tour, Integer>{

	List<Tour> findByName(String name);
	List<Tour> findByType(String type);
	List<Tour> findByCapacity(int capacity);
	List<Tour> findByAvailability(boolean availability);

}
