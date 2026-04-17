package Pages;

import static Pages.UsefulConstants.*;

public class ChamadaDePaginas {
    public static void main(String[] args) throws InterruptedException {

        try {
            start();
            ConsultaNotificacoesLinkedinPage consultaNotificacoesLinkedinPageObject = new ConsultaNotificacoesLinkedinPage();
                consultaNotificacoesLinkedinPageObject.ConsultaAparelhoAmazon();

        } catch (Exception e) {
            System.err.println("Erro no teste Consulta_Notificações_Linkedin " + e.getMessage());
            e.printStackTrace();

        } finally {
            close();

        }
    }
}