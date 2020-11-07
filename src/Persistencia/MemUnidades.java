package Persistencia;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import LogicaUnidades.Unidade;

public class MemUnidades implements UnidadesDAO{
	private Set<Unidade> maquinas;
	
	public MemUnidades (){ 
		this.maquinas = new HashSet<Unidade>();
	}
	
	@Override
	public String salvarUnidade(Unidade unidade) {
		this.maquinas.add(unidade);
		return "Unidade Inserida com sucesso";
	}

	@Override
	public void getUnidades(List<Unidade> unidade) {
		unidade.addAll(this.maquinas);
	}

	@Override
	public String atualizarUnidade(int id, float abscissa, float ordenada) throws Exception {
		for (Unidade unidade : maquinas) {
			if (unidade.getId() == id) {
				unidade.setAbcissa(abscissa);
				unidade.setOrdenada(ordenada);
				return "Maquina Id: " + id + "movida com sucesso";
			}
		}
		return "Maquina " + id + " nao foi encontrada";
	}

	@Override
	public String excluirUnidade(int id) throws SQLException {
		for (Unidade unidade : maquinas) {
			if (unidade.getId() == id) {
				maquinas.remove(unidade);
				return "Maquina " + id + " excluida com sucesso";
			}
		}
		return "Maquina " + id + " nao foi encontrada";
	}
}
