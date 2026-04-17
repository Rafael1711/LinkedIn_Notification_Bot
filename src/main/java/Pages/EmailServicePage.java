package Pages;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class EmailServicePage {

     private static final String PATH_SENHA = "E:\\Projetos\\Automações\\CREDENCIAIS_CONSULTA_NOTIFICACOES_LINKEDIN\\SENHA_EMAIL.txt";

     public static void enviarRelatorioUsuario(String mensagemRelatorio) {

          // Configurações do servidor
          String host = "smtp.gmail.com";
          final String usuario = "frbs1711@gmail.com";
          final String senha = FileHelperPage.lerStringArquivo(PATH_SENHA);
          String listaDestinatarios = "frbs171103@gmail.com";

          Properties props = new Properties();
          props.put("mail.smtp.auth", "true");
          props.put("mail.smtp.starttls.enable", "true");
          props.put("mail.smtp.host", host);
          props.put("mail.smtp.port", "587");

          Session session = Session.getInstance(props, new Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario, senha);
               }
          });

          try {
               Message message = new MimeMessage(session);
               message.setFrom(new InternetAddress(usuario));
               message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(listaDestinatarios));
               message.setSubject("Relatório de verificação de mensagens no Linkedin");

               // Corpo do e-mail
               message.setText(mensagemRelatorio);

               Transport.send(message);
               System.out.println("E-mail enviado com sucesso!");

          } catch (MessagingException e) {
               System.err.println("Falha ao enviar e-mail: " + e.getMessage());
          }
     }
}