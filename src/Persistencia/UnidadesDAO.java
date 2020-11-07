package Persistencia;

import java.sql.SQLException;
import java.util.List;

import LogicaUnidades.Unidade;

public interface UnidadesDAO {

	public String salvarUnidade(Unidade unidade) throws Exception;
	public void getUnidades(List<Unidade> unidade) throws Exception;
	public String atualizarUnidade(int id, float abcissa, float ordenada) throws Exception;
	public String excluirUnidade (int id) throws SQLException;
}
