package LogicaUnidades;

import java.util.Comparator;

public class UnidadeComparator implements Comparator<Unidade>{

	private float abscissa;
	private float ordenada;
	
	public UnidadeComparator (float abscissa, float ordenada) {
		this.abscissa = abscissa;
		this.ordenada = ordenada;
	}
	
	public int compare(Unidade o1, Unidade o2) {
		return o1.compareTo(this.abscissa, this.ordenada, o2);
	}

}
