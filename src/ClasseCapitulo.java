import java.util.Scanner;

public class ClasseCapitulo {

    String nome;
    String texto;
    String escolha1;
    String escolha2;
    int alteracaoEnergia;
    ClassePersonagem personagem1;
    ClassePersonagem personagem2;
    
    Scanner escaneador = new Scanner(System.in);
    
    public ClasseCapitulo(
        
        String nome,
        String texto,
        ClassePersonagem personagem,
        ClassePersonagem personagem2,
        String escolha1,
        String escolha2,
        int alteracaoEnergia
        
        )
        
    {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.alteracaoEnergia = alteracaoEnergia;
    }

    public void mostrar() {

        System.out.println(

            "\nChapter's name: " + nome +
            "\nChapter text: " + texto +
            "\nEscolha 1: " + escolha1 +
            "\nEscolha 2: " + escolha2
            
            );
            
        }
        
    public ClasseCapitulo textoCap(String string) {
        
        return null;
    }
    
    public int escolher() {
        
        String escolha = escaneador.nextLine();
        
        
        if (escolha.toLowerCase().equals(escolha1)) {
            
            return 1;
        }
        else if (escolha.toLowerCase().equals(escolha2)) {
            
            return 2;
        }
        else {
            return 0;
        }
    }   
}