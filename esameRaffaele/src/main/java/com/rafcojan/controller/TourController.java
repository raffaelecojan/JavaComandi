package com.rafcojan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafcojan.entities.Tour;
import com.rafcojan.service.TourService;



@RestController
@RequestMapping("/api/tour")

public class TourController {

	@Autowired
	private TourService tourService;
	
	@GetMapping
	public List<Tour> getAllVideoGiochi(){
		return tourService.getAllTour();
	}
	
	@GetMapping("/idPrenotazione")
	public Tour getTourById(@PathVariable int id) {
		return tourService.getTourById(id);
	}
	
	@PostMapping()
	public Tour savePrenotazione(@RequestBody  Tour tour) {
		return tourService.saveTour(tour);
	}
	
	@DeleteMapping("/deletePrenotazione}")
	public void deletePrenotazione(@PathVariable int id) {
		tourService.deleteTour(id);
	}
}
