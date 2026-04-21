package Locators;

import org.openqa.selenium.By;

public interface Consulta_Notificacoes_Linkedin_Locators {
    static String URL_NAVEGACAO = "https://www.linkedin.com";
    static String STRING_TITULO_PERFIL = "Rafael Sousa";
    final String PATH_LOGIN = "E:\\Projetos\\Automações\\CREDENCIAIS_CONSULTA_NOTIFICACOES_LINKEDIN\\LOGIN.txt";
    final String PATH_SENHA = "E:\\Projetos\\Automações\\CREDENCIAIS_CONSULTA_NOTIFICACOES_LINKEDIN\\SENHA_LINKEDIN.txt";

    By  TITULO_PERFIL = By.linkText("Rafael Sousa");
    By  BOTAO_ENTRAR = By.xpath("//a[@class='nav__button-secondary btn-secondary-emphasis ml-3 btn-md']");
    By  BOTAO_ENTRAR_LOGIN = By.xpath("//button[@type='submit']");
    By  CAMPO_LOGIN = By.xpath("//input[@id='username']");
    By  CAMPO_SENHA = By.xpath("//input[@id='password']");
    By  BADGE_MENSAGEM = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/header[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[4]/a[1]/span[1]/span[1]");

}