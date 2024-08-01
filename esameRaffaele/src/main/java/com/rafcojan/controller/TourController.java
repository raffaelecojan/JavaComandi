package com.rafcojan.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rafcojan.entities.Tour;
import com.rafcojan.service.TourService;



@RestController
@RequestMapping("/api/tour")
public class TourController {

	@Autowired
	private TourService tourService;
	
	@GetMapping("/allTour")
	public List<Tour> getAllTour(){
		return tourService.getAllTour();
	}
	
	@GetMapping("/idTour")
	public Tour getTourById(@RequestParam int id) {
		return tourService.getTourById(id);
	}
	
	@PostMapping("/saveTour")
	public Tour saveTour(@RequestBody  Tour tour) {
		return tourService.saveTour(tour);
	}
	
	@DeleteMapping("/deleteTour")
	public void deleteTour(@RequestParam int id) {
		tourService.deleteTour(id);
	}
	
	@GetMapping("/nameTour")
	public List<Tour> getByName(@RequestParam String name){
		return tourService.getByName(name);
	}
	
	@GetMapping("/typeTour")
	public List<Tour> getByType(@RequestParam String type){
		return tourService.getByType(type);
	}
	
	@GetMapping("/capacityTour")
	public List<Tour> getByCapacity(@RequestParam int capacity){
		return tourService.getByCapacity(capacity);
	}
	
	@GetMapping("/capacityTour")
	public List<Tour> getByAvailability(@RequestParam boolean availability){
		return tourService.getByAvailability(availability);
	}
	
}
