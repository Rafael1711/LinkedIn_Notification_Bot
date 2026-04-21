package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.JOptionPane;
import java.util.List;

import static Locators.Consulta_Notificacoes_Linkedin_Locators.*;

public class ConsultaNotificacoesLinkedinPage extends UsefulConstants {

     public void consultaNotificacoesLinkedin() throws InterruptedException {

          Xerxes.get("https://www.linkedin.com");

          VerificoUrl(URL_NAVEGACAO);

          final String LOGIN = FileHelperPage.lerStringArquivo(PATH_LOGIN);
          final String SENHA = FileHelperPage.lerStringArquivo(PATH_SENHA);

          ClicoNoElemento(BOTAO_ENTRAR);
          Envio_O_Dado(CAMPO_LOGIN, LOGIN);
          Envio_O_Dado(CAMPO_SENHA, SENHA);
          ClicoNoElemento(BOTAO_ENTRAR_LOGIN);

          Thread.sleep(4000);

          // 🔎 Verificação simples via badge de mensagens
          List<WebElement> badges = Xerxes.findElements(BADGE_MENSAGEM);

          boolean temMensagens = false;

          if (!badges.isEmpty()) {
               String valor = badges.get(0).getText().trim();

               if (!valor.isEmpty() && !valor.equals("0")) {
                    temMensagens = true;
               }
          }

          String mensagemInicial;
          String relatorio;

          if (temMensagens) {
               mensagemInicial = "📩 Novas mensagens pendentes!";
               System.out.println(mensagemInicial);

               relatorio = "Fala, anjo moreno!\n" +
                       "Você tem mensagens pendentes no LinkedIn.\n" +
                       "Dá uma olhada lá 👀" +
                       "\n\nXerxes te avisando 🤖";
          } else {
               mensagemInicial = "✅ Nenhuma mensagem pendente!";
               System.out.println(mensagemInicial);

               relatorio = "Fala, anjo moreno!\n" +
                       "Tudo certo! Nenhuma mensagem pendente no LinkedIn." +
                       "\n\nXerxes cuidando de tudo 😎";
          }

          // Fecha navegador
          UsefulConstants.close();

          // Modal 1
          JOptionPane.showMessageDialog(null,
                  mensagemInicial,
                  "Status",
                  JOptionPane.INFORMATION_MESSAGE);

          // Modal 2
          JOptionPane.showMessageDialog(null,
                  "📤 Enviando e-mail...",
                  "Processo",
                  JOptionPane.INFORMATION_MESSAGE);

          try {
               EmailServicePage.enviarRelatorioUsuario(relatorio);

               JOptionPane.showMessageDialog(null,
                       "✅ E-mail enviado com sucesso!",
                       "Sucesso",
                       JOptionPane.INFORMATION_MESSAGE);

          } catch (Exception e) {

               JOptionPane.showMessageDialog(null,
                       "❌ Erro ao enviar e-mail!",
                       "Erro",
                       JOptionPane.ERROR_MESSAGE);

               e.printStackTrace();
          }
     }
}