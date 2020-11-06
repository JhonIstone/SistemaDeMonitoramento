package Sistema;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import LogicaUnidades.Unidade;
import LogicaUnidades.UnidadeComparator;
import LogicaUnidades.UnidadeEuclidiana;
import LogicaUnidades.UnidadeManhatan;
import LogicaUnidades.UnidadesDTO;
import Persistencia.SQLUnidade;
import Persistencia.UnidadesDAO;

public class Sistema{
	
	private UnidadesDAO unidadesdao; 
	
	public Sistema () throws SQLException{
            this.unidadesdao = new SQLUnidade();
	}
	
	public void addUnidadeManhatan (int id, float abscissa, float ordenada, boolean video, boolean termometro, boolean co2, 
									boolean metano) throws Exception{
		Unidade UniMan = new UnidadeManhatan(id, abscissa, ordenada, 
		 video, termometro, co2, metano);
        this.unidadesdao.salvar(UniMan);
                
	}
	
	public void addUnidadeEuclidiana(int id, float abscissa, float ordenada, boolean video, boolean termometro, boolean co2, 
									boolean metano) throws Exception {
		Unidade UniEuc = new UnidadeEuclidiana(id, abscissa, ordenada, video, termometro, co2, metano);

            this.unidadesdao.salvar(UniEuc);
	}
	
	public String monitorar (float abscissa,  float ordenada, boolean video, boolean termometro, 
							boolean co2, boolean metano) throws Exception{
		List<Unidade> listunidade = new ArrayList<Unidade>();
		unidadesdao.get(listunidade);
		UnidadesDTO unidade = null;
		if (!listunidade.isEmpty()) {
			Collections.sort(listunidade, new UnidadeComparator(abscissa, ordenada));
	
			for (Unidade uni : listunidade) {
				if (uni.isConfigurada(video, termometro, co2, metano)) {
					unidade = new UnidadesDTO(uni.getId(), abscissa, ordenada);
					this.unidadesdao.atualizar(unidade.getId(), abscissa, ordenada);
					break;
				}
			}
		}
		
		try {
			return unidade.toString();
		} catch (NullPointerException e) {
			return "Nenhuma maquina disponivel!!";
		}
	}
}
