package Pages;

import static Locators.Consulta_Notificacoes_Linkedin_Locators.*;

import javax.swing.JOptionPane;

public class ConsultaNotificacoesLinkedinPage extends UsefulConstants {

     public void consultaNotificacoesLinkedin() {

          Xerxes.get("https://www.linkedin.com");

          VerificoUrl(URL_NAVEGACAO);

          final String LOGIN = FileHelperPage.lerStringArquivo(PATH_LOGIN);
          final String SENHA = FileHelperPage.lerStringArquivo(PATH_SENHA);

          ClicoNoElemento(BOTAO_ENTRAR);
          Envio_O_Dado(CAMPO_LOGIN, LOGIN);
          Envio_O_Dado(CAMPO_SENHA, SENHA);
          ClicoNoElemento(BOTAO_ENTRAR_LOGIN);

          VerificoTitulo(TITULO_PERFIL, STRING_TITULO_PERFIL);

          boolean temMensagens = Xerxes.findElements(BADGE_MENSAGEM).size() > 0;

          String mensagemInicial;
          String relatorio;

          if (temMensagens) {
               System.out.println("Novas mensagens pendentes!");

               mensagemInicial = "Novas mensagens pendentes!";

               relatorio = "Fala, anjo moreno!\n" +
                       "Acesse o Linkedin e verifique suas notificações, tem mensagem pendente." +
                       "\n\nDiagnóstico gerado por seu amigo, Xerxes! ;)";

          } else {
               System.out.println("Sem mensagens pendentes!");

               mensagemInicial = "Sem mensagens pendentes!";

               relatorio = "Fala, anjo moreno!\n" +
                       "Não encontrei mensagens pendentes." +
                       "\n\nDiagnóstico gerado por seu amigo, Xerxes! =)";
          }

          // Fecha navegador
          UsefulConstants.close();

          // Modal 1 - status inicial
          JOptionPane.showMessageDialog(null,
                  mensagemInicial,
                  "Status",
                  JOptionPane.INFORMATION_MESSAGE);

          // Modal 2 - envio
          JOptionPane.showMessageDialog(null,
                  "Enviando e-mail...",
                  "Processo",
                  JOptionPane.INFORMATION_MESSAGE);

          try {
               EmailServicePage.enviarRelatorioUsuario(relatorio);

               // Modal sucesso
               JOptionPane.showMessageDialog(null,
                       "E-mail enviado com sucesso!",
                       "Sucesso",
                       JOptionPane.INFORMATION_MESSAGE);

          } catch (Exception e) {

               // Modal erro
               JOptionPane.showMessageDialog(null,
                       "Erro ao enviar e-mail!",
                       "Erro",
                       JOptionPane.ERROR_MESSAGE);

               e.printStackTrace();
          }
     }
}