import java.util.Scanner;

public class ClasseCapitulo {

    String nome;
    String texto;
    String[] escolhas;
    int alteracaoEnergia;
    ClassePersonagem personagem1;
    ClassePersonagem personagem2;
    
    Scanner escaneador = new Scanner(System.in);
    
    public ClasseCapitulo(
        
        String nome,
        String texto,
        ClassePersonagem personagem1,
        ClassePersonagem personagem2,
        String[] escolhas,
        int alteracaoEnergia
        
        )
        
    {
        this.nome = nome;
        this.texto = texto;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escolhas = escolhas;
    }



    public void mostrar() {

        System.out.println(

            "\nChapter's name: " + nome +
            "\nChapter text: " + texto +
            "\nEscolhas:\n-> " + escolhas[0] +
            "\n-> " + escolhas[1]
            
            );
            
        }
        
    public ClasseCapitulo textoCap(String string) {
        
        return null;
    }
    
    public int escolher() {
        
        String escolha = escaneador.nextLine();
        
        int retorno = 0;

        for (int i = 0; i < escolhas.length; i++){
            
            if (escolha.toLowerCase().equals(escolhas[i].toLowerCase())) {

            retorno = i;
            }

        }

    return retorno;

    }   

}