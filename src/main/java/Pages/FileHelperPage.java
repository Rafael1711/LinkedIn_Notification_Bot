package Pages;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHelperPage {

     public static int lerInteiroArquivo(String PATH_ARQUIVO) {
          try {
               String conteudo = new String(Files.readAllBytes(Paths.get(PATH_ARQUIVO))).trim();
               return Integer.parseInt(conteudo);
          } catch (Exception e) {
               return 0;
          }
     }

     public static String lerStringArquivo(String PATH_STRING) {
          try {
               String conteudo = new String(Files.readAllBytes(Paths.get(PATH_STRING))).trim();
               return conteudo;
          } catch (Exception e) {
               return "Arquivo vazio ou não encontrado";
          }
     }

     public static void salvarQtdArquivo(String PATH_ARQUIVO, String novoValor) {
          try {
               Files.write(Paths.get(PATH_ARQUIVO), String.valueOf(novoValor).getBytes());
                    System.out.println("\n Arquivo salvo com sucesso!");
          } catch (IOException e) {
               System.err.println("Erro ao salvar arquivo: " + e.getMessage());
          }
     }
}