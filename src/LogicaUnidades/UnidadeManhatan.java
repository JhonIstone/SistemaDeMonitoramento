package LogicaUnidades;
public class UnidadeManhatan extends Unidade{	
	
	public UnidadeManhatan(int id, float abscissa, float ordenada, 
			boolean video, boolean termometro, boolean co2, 
			boolean metano){
		this.setAbcissa(abscissa);
		this.setCo2(co2);
		this.setId(id);
		this.setMetano(metano);
		this.setOrdenada(ordenada);
		this.setTermometro(termometro);
		this.setVideo(video);
	}
	
	public boolean isConfigurada(boolean video, boolean termometro, 
			boolean co2, boolean metano) {
		if(this.isVideo() == video || !video)
			if(this.isTermometro() == termometro || !termometro)
				if(this.isCo2() == co2 || !co2)
					if(this.isMetano() == metano || !metano)
						return true;
		return false;
	}

	public String toString() {
		return "ID:" + this.getId() + "\n"
				+ "Coordenadas:" + this.getAbscissa() + "/" + this.getOrdenada() + 
				"\n" + "Equipamentos:" + "\n" + 
				"Leitor de Metano:" + this.isMetano() + "\n" + 
				"Leitor de Co2:" + this.isCo2() + "\n" 
				+ "Video:" + this.isVideo() + "\n" + 
				"Leitor de temperatura:" + this.isTermometro();
	}
	
	public float distancia (float abscissa, float ordenada) {
		
		return (float) (Math.abs(abscissa - this.getAbscissa()) + Math.abs(ordenada - this.getOrdenada()));
	}	

}