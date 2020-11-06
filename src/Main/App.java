	package Main;
import javax.swing.JFrame;

import UI.SistemaUI;

public class App {
	public static void main(String[] args) throws Exception {
		
		/*Unidade un1 = new UnidadeEuclidiana(1, 100, 100, true, true, false, false);
		Unidade un2 = new UnidadeManhatan(2, 50, 80, true, true, false, false);
		Unidade un3 = new UnidadeEuclidiana(3, 30, 30, true, true, false, false);
		
		System.out.println(un1.distancia(245, 150));
		System.out.println(un2.distancia(245,150));
		System.out.println(un3.distancia(245, 150));*/
		
		//Sistema unidades = new Sistema();
		//unidades.addUnidadeEuclidiana(1, 100, 100, true, true, false, false);
		//unidades.addUnidadeManhatan(2, 50, 80, true, true, false, false);
		//unidades.addUnidadeEuclidiana(5, 85, 15, true, false, false, false);
		//System.out.println(unidades.monitorar(45, 45, true, false, false, false));

       JFrame tela_addUND = new SistemaUI();
       tela_addUND.setVisible(true);
	}
}
