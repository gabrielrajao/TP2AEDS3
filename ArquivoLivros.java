

import aeds3.Arquivo;
import aeds3.ListaInvertida;

public class ArquivoLivros {
    Arquivo<Livro> arqLivros;
    ListaInvertida listaInvertida;

    public ArquivoLivros(){
        try{
        arqLivros = new Arquivo<>("livros", Livro.class.getConstructor());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //Create

    //Update

    //Delete

    //Read

    public void close(){
        try{
            arqLivros.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
