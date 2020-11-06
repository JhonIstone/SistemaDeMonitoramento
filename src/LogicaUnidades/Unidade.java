package LogicaUnidades;
public abstract class Unidade{
	private int id;
	private float abscissa;
	private float ordenada;
	private boolean video;
	private boolean termometro;
	private boolean co2;
	private boolean metano;
	
	public abstract String toString();
	
	public abstract float distancia (float abcissa, float ordenada);
	public abstract boolean isConfigurada(boolean video, boolean termometro, boolean co2, boolean metano);

	public void setAbcissa(float abscissa) {
		this.abscissa = abscissa;
	}
	public void setOrdenada(float ordenada) {
		this.ordenada = ordenada;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected void setVideo(boolean video) {
		this.video = video;
	}
	protected void setTermometro(boolean termometro) {
		this.termometro = termometro;
	}
	protected void setCo2(boolean co2) {
		this.co2 = co2;
	}
	protected void setMetano(boolean metano) {
		this.metano = metano;
	}
	
	public float getAbscissa() {
		return abscissa;
	}
	public float getOrdenada() {
		return ordenada;
	}
	public int getId() {
		return id;
	}
	public boolean isVideo() {
		return video;
	}
	public boolean isTermometro() {
		return termometro;
	}
	public boolean isCo2() {
		return co2;
	}
	public boolean isMetano() {
		return metano;
	}

	public int compareTo(float abcissa2, float ordenada2, Unidade o2) {
		if(this.distancia(abcissa2, ordenada2) > o2.distancia(abcissa2, ordenada2)) {
			return 1;
		}else if(this.distancia(abcissa2, ordenada2) < o2.distancia(abcissa2, ordenada2)) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
