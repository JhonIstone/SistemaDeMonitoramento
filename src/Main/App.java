package Main;
import Sistema.Sistema;
import Ui.MenuPrincipal;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

        /*Unidade un1 = new UnidadeEuclidiana(1, 100, 100, true, true, false, false);
        Unidade un2 = new UnidadeManhatan(2, 50, 80, true, true, false, false);
        Unidade un3 = new UnidadeEuclidiana(3, 30, 30, true, true, false, false);

        System.out.println(un1.distancia(245, 150));
        System.out.println(un2.distancia(245,150));
        System.out.println(un3.distancia(245, 150));*/
        //String retorno;
        //Sistema sistema = new Sistema();
        //retorno = sistema.addUnidadeEuclidiana(1, 100, 100, true, true, false, false);
        //System.out.println(retorno);
        //sistema.addUnidadeManhatan(2, 50, 80, true, true, false, false);
        //sistema.addUnidadeEuclidiana(5, 85, 15, true, false, false, false);
        //System.out.println(sistema.monitorar(45, 45, true, false, false, false));
        //retorno = sistema.listarUnidades();
        //System.out.println(retorno);
        //retorno = sistema.excluirUnidade(1);
        //System.out.println(retorno);
        //retorno = sistema.monitorar(10, 0, true, true, false, false);
        //System.out.println(retorno);
       JFrame menuprincipal = new MenuPrincipal();
       menuprincipal.setVisible(true);
    }
}
