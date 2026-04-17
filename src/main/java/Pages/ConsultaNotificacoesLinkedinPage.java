package Pages;

import static Locators.Consulta_Notificacoes_Linkedin_Locators.*;

public class ConsultaNotificacoesLinkedinPage extends UsefulConstants {

     public void ConsultaAparelhoAmazon() {

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

               if(temMensagens){
                  System.out.println("Novas mensagens pendentes!");

                  String relatorioVerificacaoPositivo = "Fala, anjo moreno!\n" +
                            "Acesse o Linkedin e verifique suasnotificações, tem mensagem pendente." +
                            "\n\nDiagnóstico gerado por seu amigo, Xerxes! ;)";

                  EmailServicePage.enviarRelatorioUsuario(relatorioVerificacaoPositivo);

               } else {
                    System.out.println("Sem mensagens pendentes!");

                    String relatorioVerificacaoNegativo = "Fala, anjo moreno!\n" +
                            "Não encontrei mensagens pendentes." +
                            "\n\nDiagnóstico gerado por seu amigo, Xerxes! =)";

                    EmailServicePage.enviarRelatorioUsuario(relatorioVerificacaoNegativo);

               }

               ClicoNoElemento(BOTAO_PERFIL);
                    ClicoNoElemento(SAIR);
                         UsefulConstants.close();
     }
}