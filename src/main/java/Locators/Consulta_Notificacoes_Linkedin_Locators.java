package Locators;

import org.openqa.selenium.By;

public interface Consulta_Notificacoes_Linkedin_Locators {
    static String URL_NAVEGACAO = "https://www.linkedin.com";
    static String STRING_TITULO_PERFIL = "Rafael Sousa";
    final String PATH_LOGIN = "E:\\Projetos\\Automações\\CREDENCIAIS_CONSULTA_NOTIFICACOES_LINKEDIN\\LOGIN.txt";
    final String PATH_SENHA = "E:\\Projetos\\Automações\\CREDENCIAIS_CONSULTA_NOTIFICACOES_LINKEDIN\\SENHA_LINKEDIN.txt";

    By  TITULO_PERFIL = By.xpath("//p[@class='_1237295f _2364098d _811b5f26 _9aefc0fd e21e34d8 a167a43c c0fba9ee _2949d559 _7a76272b']");
    By  BOTAO_ENTRAR = By.xpath("//a[@class='nav__button-secondary btn-secondary-emphasis ml-3 btn-md']");
    By  BOTAO_ENTRAR_LOGIN = By.xpath("//button[@type='submit']");
    By  CAMPO_LOGIN = By.xpath("//input[@id='username']");
    By  CAMPO_SENHA = By.xpath("//input[@id='password']");
    By  BADGE_MENSAGEM = By.xpath("//span[@class='e77a20a4 c009e2c1 cb6e11e4 ef7b2adc _5b57fd4a f1431a3f _1ea7e8ca _9188746e _479142c3 afa46515 _20fd2b1c _80738084 _08ec1935 b6ac0836 _44432b9b bf3b3ddb _532bb125 d7081c84 _67fd2641 _1009b225 _75999737 f33883e8 a936eee2 a080721a']");
    By  BOTAO_PERFIL = By.xpath("//figure[@class='_08fea079 _60f23927 _5080bd09 _3ee8ca4e a167a43c f590635c _5eca7cce _129fa307 _38fd92f2']//img[@class='c583226e _390a211d _0f6697a0 _4bcfc755 _7480e9b1']");
    By  SAIR = By.xpath("//p[contains(text(),'Sair')]");
}