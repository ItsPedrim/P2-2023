import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

Scanner escaneador = new Scanner(System.in);

        System.out.println("Bem-vindo a CNBU - Central de Notificação de Bugs da Ubisoft. " + 
        "Eu sou o UbiBot e vou te auxiliar! =D\n\n" +
        "Primeiramente, digite o seu nome:");

        String nomeUsuario = escaneador .nextLine();
       
        System.out.println("Certo, " + nomeUsuario + "! Será um prazer ajudar. " +
        "Agora, observe a Lista de Bugs abaixo para que possa te ajudar:\n\n" +

        "--> O bug da Gravidade Seletiva : O personagem pode caminhar sobre paredes e tetos, " +
        "mas não consegue subir uma simples escada sem escorregar e cair.\n\n" +

        "--> O bug do Teleportador Maluco: Ao usar um teleportador, o personagem acaba sendo transportado" +
        "para um lugar completamente aleatório, como dentro de uma parede, no topo de uma árvore ou até mesmo em outro jogo.\n\n" +
        
        "--> O bug da Anatomia Flexível: Os membros do personagem ficam distorcidos em posições estranhas e impossíveis, " +
        "como braços atravessando o próprio corpo ou pernas girando em 360 graus.\n\n" +
        
        "--> O bug do Inimigo Congelado: Os inimigos ficam presos em uma animação de ataque, mas não conseguem" +
        "se mover ou causar qualquer dano, transformando-os em alvos fáceis.\n\n" +
        
        "--> O bug do Item Desaparecido: Após coletar um item valioso, ele simplesmente desaparece do inventário" +
        "sem deixar rastros, levando o personagem a uma busca desesperada pelo item perdido.\n\n" +
        
        "--> O bug da Câmera Rebelde: A câmera do jogo assume uma vida própria e começa a girar freneticamente, " +
        "ficar presa em paredes ou exibir ângulos impossíveis, causando tontura no jogador.\n\n" +
        
        "--> O bug da Super Velocidade: O personagem adquire uma velocidade absurda e acaba atravessando paredes, " +
        "caindo no vazio ou ultrapassando todos os obstáculos antes que o jogador consiga reagir.\n\n" +
        
        "--> O bug da Colisão Invisível: O personagem sofre colisões com objetos invisíveis, " +
        "sendo bloqueado por barreiras que não podem ser vistas, causando frustração e confusão ao jogador.\n\n" +
        
        "--> O bug da Dublagem Trocada: Os diálogos dos personagens são reproduzidos de forma aleatória, " +
        "fazendo com que vozes masculinas saiam da boca de personagens femininas e vice-versa.\n\n" +
        
        "--> O bug do Personagem Elástico: O personagem se estica e se contorce de forma bizarra, " + 
        "transformando-se em uma massa de polígonos distorcidos que lembram um ser de outro planeta.\n\n" +

        "\nCerto, " + nomeUsuario + ", com base nessa lista, digite a quantidade de bugs que você está presenciando:");

        int quantiBugs = escaneador .nextInt();
        escaneador.close();

        if (quantiBugs <= 5) {
            System.out.println("Esse não é um jogo da Ubisoft. Espero ter ajudado! ^-^");
        }
        else if (quantiBugs <= 10) {
            System.out.println("Obrigado pelo seu Feedback! " +
            "Enviaremos sua avalição para o time de bugs o mais rápido possível! ^-^");
        }
        else {
            System.out.println("Tem mais bugs do que havíamos previsto! " +
            "Enviaremos sua avaliação para o time de bugs o mais rápido possível! ^-^");
        }
    }
}






// double result = potenciar(3,5);
    
//     }

//      private static double potenciar(double n, double p) {
//         double resultado = 1;
        
//         if (p < 0) {
//             boolean pNegativo = true;
//             p = -p;
//         }

//         for(int i = 0; i < p; i++) {
//             resultado = multiplicar(n, resultado);
//         }
//         return resultado;
//     }

//     private static double multiplicar(double a, double b) {
//         double resultado = 0;
//         boolean bNegativo = false;


//         if (b < 0) {
//             bNegativo = true;
//         }
//         return resultado;
//     }
//     private static double fatorar(double v) {
//         double resultado = 1;
        
//         if (v > 1) {
//             resultado = v * fatorar(v-1);
//         }
        
//         return resultado;
//     }
// }


        
//         Scanner escaneador = new Scanner(System.in);

//         System.out.println("Bem-vindo a CNBU - Central de Notificação de Bugs da Ubisoft. " + 
//         "Eu sou o UbiBot e vou te auxiliar! =D\n\n" +
//         "Primeiramente, digite o seu nome:");

//         String nomeUsuario = escaneador .nextLine();
       
//         System.out.println("Certo, " + nomeUsuario + "! Será um prazer ajudar. " +
//         "Agora, observe a Lista de Bugs abaixo para que possa te ajudar:\n\n" +

//         "--> O bug da Gravidade Seletiva : O personagem pode caminhar sobre paredes e tetos, " +
//         "mas não consegue subir uma simples escada sem escorregar e cair.\n\n" +

//         "--> O bug do Teleportador Maluco: Ao usar um teleportador, o personagem acaba sendo transportado" +
//         "para um lugar completamente aleatório, como dentro de uma parede, no topo de uma árvore ou até mesmo em outro jogo.\n\n" +
        
//         "--> O bug da Anatomia Flexível: Os membros do personagem ficam distorcidos em posições estranhas e impossíveis, " +
//         "como braços atravessando o próprio corpo ou pernas girando em 360 graus.\n\n" +
        
//         "--> O bug do Inimigo Congelado: Os inimigos ficam presos em uma animação de ataque, mas não conseguem" +
//         "se mover ou causar qualquer dano, transformando-os em alvos fáceis.\n\n" +
        
//         "--> O bug do Item Desaparecido: Após coletar um item valioso, ele simplesmente desaparece do inventário" +
//         "sem deixar rastros, levando o personagem a uma busca desesperada pelo item perdido.\n\n" +
        
//         "--> O bug da Câmera Rebelde: A câmera do jogo assume uma vida própria e começa a girar freneticamente, " +
//         "ficar presa em paredes ou exibir ângulos impossíveis, causando tontura no jogador.\n\n" +
        
//         "--> O bug da Super Velocidade: O personagem adquire uma velocidade absurda e acaba atravessando paredes, " +
//         "caindo no vazio ou ultrapassando todos os obstáculos antes que o jogador consiga reagir.\n\n" +
        
//         "--> O bug da Colisão Invisível: O personagem sofre colisões com objetos invisíveis, " +
//         "sendo bloqueado por barreiras que não podem ser vistas, causando frustração e confusão ao jogador.\n\n" +
        
//         "--> O bug da Dublagem Trocada: Os diálogos dos personagens são reproduzidos de forma aleatória, " +
//         "fazendo com que vozes masculinas saiam da boca de personagens femininas e vice-versa.\n\n" +
        
//         "--> O bug do Personagem Elástico: O personagem se estica e se contorce de forma bizarra, " + 
//         "transformando-se em uma massa de polígonos distorcidos que lembram um ser de outro planeta.\n\n" +

//         "Certo, " + nomeUsuario + ", com base nessa lista, digite a quantidade de bugs que você está presenciando:");

//         int quantiBugs = escaneador .nextInt();
//         escaneador.close();

//         if (quantiBugs <= 5) {
//             System.out.println("Esse não é um jogo da Ubisoft. Espero ter ajudado! ^-^");
//         }
//         else if (quantiBugs <= 10) {
//             System.out.println("Obrigado pelo seu Feedback! " +
//             "Enviaremos sua avalição para o time de bugs o mais rápido possível! ^-^");
//         }
//         else {
//             System.out.println("Tem mais bugs do que havíamos previsto! " +
//             "Enviaremos sua avaliação para o time de bugs o mais rápido possível! ^-^");
//         }
//     }
// }
