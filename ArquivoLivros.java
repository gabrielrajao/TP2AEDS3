

import java.io.RandomAccessFile;
import java.util.ArrayList;

import aeds3.Arquivo;
import aeds3.ListaInvertida;

public class ArquivoLivros {
    Arquivo<Livro> arqLivros;
    ListaInvertida listaInvertida;
    ArrayList<String> listaStopwords;

    public ArquivoLivros() throws Exception{
        arqLivros = new Arquivo<>("livros", Livro.class.getConstructor());
        listaInvertida = new ListaInvertida(4, "dados/dicionario.listainv.db", "dados/blocos.listainv.db");
        listaStopwords = getStopwords();
    }

    //Cria a lista de stopwords
    ArrayList<String> getStopwords() throws Exception{
        RandomAccessFile arqStopWords = new RandomAccessFile("./dados/estaticos/stopwords.db", "r");
        arqStopWords.seek(0);
        ArrayList<String> result = new ArrayList<String>();
        while(arqStopWords.length() > arqStopWords.getFilePointer()){
            result.add(arqStopWords.readUTF());
        }

        arqStopWords.close();
        return result;
    }

    //Create
    public int create(Livro obj) throws Exception{


        int id = arqLivros.create(obj);

        if(id > 0){
            //Separa as  palavras por espaço em branco
            String[] listaPalavras = obj.getTitulo().split(" ");

            for( String palavra : listaPalavras){
                //Remove pontos e transforma a palavra em lowerCase (limpa)
                String limpa = palavra
                .replace(",", "")
                .replace(".", "")
                .replace(":", "")
                .replace(";", "")
                .replace("!", "")
                .replace("?", "")
                .toLowerCase();

                if(listaStopwords.contains(limpa) == false){
                    listaInvertida.create(limpa, id);
                } 
             }
        }

        


        


        return id;
    }

    //DEBUG
    public void DEBUG() throws Exception{
        for(int i = 1; i <= arqLivros.tamanho(); i++){
            System.out.println(arqLivros.read(i).toString());
        }

        listaInvertida.print();
        
    }

    //Update

    //Delete

    //Read

    public void close() throws Exception{
        arqLivros.close();
        listaInvertida.close(); 
    }

    
}
