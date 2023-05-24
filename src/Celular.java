import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class Celular {
    public static void main(String[] args) {
        AparelhoTelefonico ap = new AparelhoTelefonico();
        ap.ligar();
        ap.atender();
        ap.iniciarCorreioVoz();
        System.out.println("");

        NavegadorInternet ni = new NavegadorInternet();
        ni.exibirPagina();
        ni.adicionarNovaAba();
        ni.atualizarPagina();
        System.out.println("");

        ReprodutorMusical rm = new ReprodutorMusical();
        rm.tocar();
        rm.pausar();
        rm.selecionarMusica();
    }
}
