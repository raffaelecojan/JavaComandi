package com.rafcojan.entities;

//import java.util.List;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "tour")
public class Tour {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int tourId;
	    private String name;
	    private String type;
	    private int capacity;
	    private boolean availability;
	    
//	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tour", cascade = CascadeType.ALL)
//	    private List<Prenotazioni> prenotazioni;
	    

//		public List<Prenotazioni> getPrenotazioni() {
//			return prenotazioni;
//		}
//
//		public void setPrenotazioni(List<Prenotazioni> prenotazioni) {
//			this.prenotazioni = prenotazioni;
//		}

		public int getTourId() {
			return tourId;
		}

		public void setTourId(int tourId) {
			this.tourId = tourId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public boolean isAvailability() {
			return availability;
		}

		public void setAvailability(boolean availability) {
			this.availability = availability;
		}
	    
		
	
	  
	}

