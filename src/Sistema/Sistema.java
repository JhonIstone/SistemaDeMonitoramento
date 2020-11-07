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
	
	public String addUnidadeManhatan (int id, float abscissa, float ordenada, boolean video, boolean termometro, boolean co2, 
									boolean metano) throws Exception{
		Unidade UniMan = new UnidadeManhatan(id, abscissa, ordenada, video, termometro, co2, metano);
        return this.unidadesdao.salvarUnidade(UniMan);
                
	}

	public String addUnidadeEuclidiana(int id, float abscissa, float ordenada, boolean video, boolean termometro, boolean co2, boolean metano) throws Exception {
		Unidade UniEuc = new UnidadeEuclidiana(id, abscissa, ordenada, video, termometro, co2, metano);
        	return this.unidadesdao.salvarUnidade(UniEuc);
	}
	
	public String monitorar (float abscissa,  float ordenada, boolean video, boolean termometro, 
							boolean co2, boolean metano) throws Exception{
		List<Unidade> listunidade = new ArrayList<Unidade>();
		unidadesdao.getUnidades(listunidade);
		UnidadesDTO unidade = null;
		if (!listunidade.isEmpty()) {
			Collections.sort(listunidade, new UnidadeComparator(abscissa, ordenada));
	
			for (Unidade uni : listunidade) {
				if (uni.isConfigurada(video, termometro, co2, metano)) {
					unidade = new UnidadesDTO(uni.getId(), abscissa, ordenada);
					this.unidadesdao.atualizarUnidade(unidade.getId(), abscissa, ordenada);
					break;
				}
			}
		}
		
		try {
			return "Uniadade Id: " + unidade.toString() + "movida para: " 
		+ unidade.getAbscissa() + " X " + unidade.getOrdenada();
		} catch (NullPointerException e) {
			return "Nenhuma maquina disponivel!!";
		}
	}
	
	public String listarUnidades () throws Exception {

		List<Unidade> listunidade = new ArrayList<Unidade>();
		unidadesdao.getUnidades(listunidade);
		String lista = new String();
			for (Unidade unidade : listunidade) {
				lista += "Maquina ID:" + unidade.getId() + " Posicao: " 
				+ unidade.getAbscissa() + " X " + unidade.getOrdenada() + "\n";
			}
			if (lista.isEmpty())
				return "Nenhuma maquina encontrada!!";
			else
				return lista;		
	}			
		
	public String excluirUnidade (int id) throws SQLException {
		String retorno = new String();
			retorno = unidadesdao.excluirUnidade(id);
			return retorno;
	}
}
