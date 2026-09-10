package br.com.artur.utilitarios;

public class FormatadorUniversal{

  public static String formatarCpf(String cpfCru){
  //Remove tudo que não seja número  
  cpfCru = cpfCru.replaceAll("[^0-9]", "");

  //Se não tiver 11 devolde
  if(!cpfCru.matches("\\d{11}")){
    return cpfCru;
  }
    
  //Aplica 
  
