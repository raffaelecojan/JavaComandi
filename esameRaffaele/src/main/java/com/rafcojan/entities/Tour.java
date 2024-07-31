package com.rafcojan.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tour {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String name;
	    private String type;
	    private int capacity;
	    private boolean availability;
	    
		public Tour(int id, String name, String type, int capacity, boolean availability) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
			this.capacity = capacity;
			this.availability = availability;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

