package Persistencia;

import java.sql.Statement;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import LogicaUnidades.Unidade;
import LogicaUnidades.UnidadeEuclidiana;
import LogicaUnidades.UnidadeManhatan;

public class SQLUnidade implements UnidadesDAO{
	private static String URI = "jdbc:h2:~/Unidades";
	private static String SAVE_SQL = "INSERT INTO UNIDADE (ID, ABCISSA, ORDENADA, VIDEO, TERMOMETRO, CO2, METANO, TIPO)" 
	+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; 
	private static String GET_SQL = "SELECT * FROM UNIDADE";
	private static String UPDATE_SQL = "UPDATE UNIDADE SET ABCISSA = ?, ORDENADA = ? WHERE ID = ?";
	private static String DELET_SQL = "DELETE FROM UNIDADE WHERE ID = ?";
		
	public SQLUnidade () throws SQLException {
		DriverManager.registerDriver(new org.h2.Driver());
	}
	
	private Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(URI);
		return conn;
	}
	
	public String salvarUnidade(Unidade unidade) throws SQLException {
		PreparedStatement ps = this.getConnection().prepareStatement(SAVE_SQL);
		ps.setInt(1, unidade.getId());
		ps.setFloat(2, unidade.getAbscissa());
		ps.setFloat(3, unidade.getOrdenada());
		ps.setBoolean(4, unidade.isVideo());
		ps.setBoolean(5, unidade.isTermometro());
		ps.setBoolean(6, unidade.isCo2());
		ps.setBoolean(7, unidade.isMetano());
		
		if (unidade instanceof UnidadeEuclidiana)
			ps.setBoolean(8, true);
		else
			ps.setBoolean(8, false);
		
		try {
			ps.executeUpdate();
			ps.close();
			return "Maquina Id: " + unidade.getId() + " adicionar com sucesso";
		} catch (SQLIntegrityConstraintViolationException e) {
			return "Este Id  ja esta em uso por outra maquina";
		}
		
	}
	
	public void getUnidades(List<Unidade> unidade) throws SQLException {
		Statement stmt = this.getConnection().createStatement();//GET_SQL
		if (stmt.execute(GET_SQL));
			ResultSet rs = stmt.getResultSet();
		
		while (rs.next()) {
			int id = rs.getInt("ID");
			float abcissa = rs.getFloat("ABCISSA");
			float ordenada = rs.getFloat("ORDENADA");
			boolean video = rs.getBoolean("VIDEO");
			boolean termometro = rs.getBoolean("TERMOMETRO");
			boolean co2 = rs.getBoolean("CO2");
			boolean metano = rs.getBoolean("METANO");
			boolean tipo = rs.getBoolean("TIPO");
			
			if (tipo) 
				unidade.add(new UnidadeEuclidiana(id, abcissa, ordenada, video, termometro, co2, metano));
				
			else 
				unidade.add(new UnidadeManhatan(id, abcissa, ordenada, video, termometro, co2, metano));
		}
		rs.close();
		stmt.close();
	}		
	
	public String atualizarUnidade(int id, float abcissa, float ordenada) throws SQLException {
		PreparedStatement upabc = this.getConnection().prepareStatement(UPDATE_SQL);
		upabc.setFloat(1, abcissa);
		upabc.setFloat(2, ordenada);
		upabc.setInt(3, id);
		try {
			upabc.executeUpdate();
			upabc.close();
			return "Maquina Id: " + id + "movida para: " 
					+ abcissa + " X " + ordenada;
		} catch (BatchUpdateException e) {
			return "OCORREU UM ERRO AO ATUALIZAR A LOCALIZAÇÃO DA MAQUINA";
		}
		
	}
	
	public String excluirUnidade (int id) throws SQLException {
		PreparedStatement delet = this.getConnection().prepareStatement(DELET_SQL);
		delet.setInt(1, id);
		try {
			delet.executeUpdate();
			delet.close();
			return "Maquina " + id + " removida";
		} catch (SQLException e) {
			return "Maquina " + id + " nao foi encontrada";
		} 
	}

}
