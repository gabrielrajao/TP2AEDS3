import java.io.*;

import aeds3.Arquivo;

class Principal {

  public static void main(String args[]) {
    

    new File("dados/livros.db").delete();
    new File("dados/livros.hash_d.db").delete();
    new File("dados/livros.hash_c.db").delete();
    new File("dados/ArquivoDeExcluidos.db").delete();



    try {
      


      System.out.println("AOAOAOA");

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}