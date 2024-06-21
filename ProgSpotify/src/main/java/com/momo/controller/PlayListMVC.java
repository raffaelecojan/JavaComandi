package com.momo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.momo.entities.PlayList;
import com.momo.entities.Utente;
import com.momo.service.PlayListService;

@Controller
public class PlayListMVC {
	
	PlayListService servicePlayList;
	
	@GetMapping("homePageUser/playList")
	public String getListaPlayList(){
		servicePlayList.getAllPlayList();
		return "homePageUser";
	}
	
	@PostMapping("homePageUser/playList")
	public String addPlayListDB(PlayList p) {
		servicePlayList.addPlayList(p);
		return "homePageUser";
	}
	
	@DeleteMapping("homePageUser")
	public String deletePlayListDB(PlayList p) {
		servicePlayList.deletePlayList(p);
		return "homePageUser";
	}

	
	

}
