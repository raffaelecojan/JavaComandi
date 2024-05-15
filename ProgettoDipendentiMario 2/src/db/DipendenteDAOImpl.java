package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Dipendente;

public class DipendenteDAOImpl implements DipendenteDAO {
	
	private Connessione miaConn=new Connessione();
	
	private PreparedStatement ps;
	
	private ResultSet rs;
	
	
	
	@Override
	public List<Dipendente> getDipendenti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDipendente(Dipendente d) {
		try {
			ps=miaConn.getConn().prepareStatement(ADD_DIPENDENTE);
			ps.setString(1, d.getNome());
			ps.setString(2, d.getRuolo());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
