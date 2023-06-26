public class ClassePersonagem {
    String nome;
    int vida;
    String tipo;

    public ClassePersonagem( String nome, int vida, String tipo) 
    {
        this.nome = nome;
        this.vida = vida;
        this.tipo = tipo;

        if (vida < 0) {
            vida = 0;
        }
    }

}
