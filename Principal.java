import java.io.*;
import java.util.ArrayList;

import aeds3.Arquivo;

class Principal {

  public static void main(String args[]) {
    

    new File("dados/livros.db").delete();
    new File("dados/livros.hash_d.db").delete();
    new File("dados/livros.hash_c.db").delete();
    new File("dados/ArquivoDeExcluidos.db").delete();
    new File("dados/blocos.listainv.db").delete();
    new File("dados/dicionario.listainv.db").delete();


    Livro l1 = new Livro(-1, "3049214201", "Diego, maior torcedor do coelhão. Diego", 24.0f);
    Livro l2 = new Livro(-1, "3552356723", "Eu dei a bunda 23 vezes para o Diego!", 20.0f);
    Livro l3 = new Livro(-1, "3252551555", "O Super mario é mais lento que o coelho.", 35.0f);
    Livro l4 = new Livro(-1, "3052252525", "Super mario: Irmãos encanadores", 27.0f);

    Livro l1upd = new Livro(-1, "3049214201", "Diego, eu disse que o coelho é o maior de Minas", 24.0f);
    Livro l2upd = new Livro(-1, "3552356723", "Minas Gerais sofre com o gigante coelho", 20.0f);

    try {


      //Abrindo arquivo para Livros
      ArquivoLivros arqLivros = new ArquivoLivros();


      int livro1 = arqLivros.create(l1);
      int livro2 = arqLivros.create(l2);
      //int livro3 = arqLivros.create(l3);
      //int livro4 = arqLivros.create(l4);

      arqLivros.DEBUG();

      //arqLivros.delete(livro1);
      //arqLivros.delete(livro2);
      //arqLivros.delete(livro3);
      //arqLivros.delete(livro4);
      
      /* 
      ArrayList<Livro> lista = arqLivros.read("Diego");

      if(lista != null){
        for(Livro l : lista){
          System.out.println(l.toString());
        }
      }
      */

      l1upd.setID(livro1);
      l2upd.setID(livro2);
      arqLivros.update(l1upd);
      arqLivros.update(l2upd);
      

      arqLivros.DEBUG();

      

      //Fim do programa
      arqLivros.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}