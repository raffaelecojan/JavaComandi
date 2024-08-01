package com.rafcojan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafcojan.entities.Tour;
import com.rafcojan.repository.TourRepo;

@Service
public class TourService {
	
	@Autowired
	private TourRepo dao;
	
	//prendi tutto o uno singolo
	public List<Tour> getAllTour(){
        return dao.findAll();
    }
	public  Tour getTourById(int id){
        return dao.findById(id).orElse(null);
    }
	
	public List<Tour> getByName(String name){
        return dao.findByName(name);
    }
	
	public List<Tour> getByType(String type){
        return dao.findByType(type);
    }
	public List<Tour> getByCapacity(int capacity){
        return dao.findByCapacity(capacity);
    }
	public List<Tour> getByAvailability(boolean availability){
        return dao.findByAvailability(availability);
    }
	
	
	//aggiungi e rimuovi
	public Tour saveTour(Tour p) {
    	return dao.save(p);
    }
	public void deleteTour(int id) {
    	dao.deleteById(id);
    }
	
	//modifica tour
	public void modificaTour(int id, Tour tour) {
		deleteTour(id);
		saveTour(tour);
	}
}
