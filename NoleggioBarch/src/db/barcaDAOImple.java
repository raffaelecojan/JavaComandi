package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Barche;

public class barcaDAOImple implements BarcaDAO{
	private Connessione miaConn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public barcaDAOImple() {
		miaConn = new Connessione();
	}

		public List<Barche> getBarches() {
			List<Barche> barcheDisponibili = new ArrayList<>();
			try {
				ps = miaConn.getConn().prepareStatement(FIND_ALL);
				rs = ps.executeQuery();
				while(rs.next()) {
					String nome = rs.getString("nome");
					String marca = rs.getString("marca");
					int velocita = rs.getInt("velocita");
					int capienza = rs.getInt("capienza");
					String disponibilita = rs.getString("disponibilita");
					Barche b = new Barche(nome, marca, velocita, capienza, disponibilita );
					barcheDisponibili.add(b);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return barcheDisponibili;
		}
		
		
	}
		

