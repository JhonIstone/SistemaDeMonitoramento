package Persistencia;

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
	public void salvar(Unidade unidade) {
		this.maquinas.add(unidade);
	}

	@Override
	public void get(List<Unidade> unidade) {
		unidade.addAll(this.maquinas);
	}

	@Override
	public void atualizar(int id, float abscissa, float ordenada) throws Exception {
		for (Unidade unidade : maquinas) 
			if (unidade.getId() == id) {
				unidade.setAbcissa(abscissa);
				unidade.setOrdenada(ordenada);
				break;
			}
	}
}
