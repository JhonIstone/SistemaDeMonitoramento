package LogicaUnidades;

public class UnidadesDTO {
	private int id;
	private float abscissa;
	private float ordenada;
	
	public UnidadesDTO(int id, float abscissa, float ordenada) {
		this.setId(id);
		this.setAbscissa(abscissa);
		this.setOrdenada(ordenada);
	}
	public String toString () {
		return "Maquina ID: " + this.getId() + " Movida para coordenada:\n" + "Abiscissa: " + this.getAbscissa() 
		+ "\n" + "Ordenada: " + this.getOrdenada();
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	

	public float getAbscissa() {
		return abscissa;
	}

	public void setAbscissa(float abscissa) {
		this.abscissa = abscissa;
	}

	public float getOrdenada() {
		return ordenada;
	}

	public void setOrdenada(float ordenada) {
		this.ordenada = ordenada;
	}

}
