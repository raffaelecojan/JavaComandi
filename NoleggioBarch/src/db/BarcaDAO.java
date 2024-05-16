package db;

import java.util.List;

import model.Barche;

public interface BarcaDAO {
	String FIND_ALL="SELECT*FROM barchedisponibili";
	
	List<Barche> getBarches();

}
