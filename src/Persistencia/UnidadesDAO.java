package Persistencia;

import java.util.List;

import LogicaUnidades.Unidade;

public interface UnidadesDAO {

	public void salvar(Unidade unidade) throws Exception;
	public void get(List<Unidade> unidade) throws Exception;
	public void atualizar(int id, float abcissa, float ordenada) throws Exception;

}
