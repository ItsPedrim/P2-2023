import java.util.Scanner;

public class MiniProject1 {
    public static void main(String[] args) throws Exception {
    
Scanner escaneador = new Scanner(System.in);
        
        // Prints out chapter 1 -------------------
        cap1();
        String escolhaCap1 = escaneador.nextLine();

        if (escolhaCap1.toLowerCase().equals("escudo")) {
            cap1Altern1();
            String escolhaCapAltern1 = escaneador.nextLine();

            // GAME OVER of Chapter 1.1 -------------------------------------
            if (escolhaCapAltern1.toLowerCase().equals("tornado")) {
                cap1Altern12();
            }

            // Player wins the game --------------------------------------------
            else if (escolhaCapAltern1.toLowerCase().equals("salto")) {
                cap1Altern3();
            }     
            }

        // GAME OVER of Chapter 1 -----------------------------------------
        else if (escolhaCap1.toLowerCase().equals("desviar")){
            cap1Altern2();
        }
        escaneador.close();
        }

// History Methods ----------------------------------------------------------------------------

    // Chapter 1
    private static void cap1() {
        
        System.out.println("Capítulo I - Eis o Manipulador da Física!\n\n" +
        "~ Após andar de ponta cabeça sobre labirintos no teto e fugir de armadilhas " +
        "sobre as paredes, correndo paralelamente ao solo, você finalmenete " + 
        " escapa das câmaras com alternação de gravidade!\n\n" +
        " Você se encontra agora em uma câmara completamente branca e vazia. " +
        "De repente, você ouve passos ecoando sobre a câmara.\n.\n.\n.\n" +
        "Você sente algo! Atrás de você, algo se aproxima em alta velocidade! O que você faz?\n" +
        "Digite: Escudo / Desviar");

    }

    // Chapter 1 - Game Over       
    private static void cap1Altern2() {
        
        System.out.println("\n~ Você tenta desviar rapidamente, mas não percebeu que " +
        "havia um campo gravitacional sobre você! Um campo gravitacional só poderia significar uma coisa: " +
        "Navi, o Manipulador da Física!\n\n" +
        "{Navi pode alterar a força da gravidade ao seu redor. Ele pode levitar objetos pesados " +
        "com facilidade ou criar campos gravitacionais intensos para atrair ou repelir qualquer coisa em seu alcance.}\n\n" +
        "{Navi possui a habilidade de Controle Cinético e Mecânico. Ele pode aumentar ou diminuir a velocidade de objetos, " +
        "além de ser capaz de aplicar forças com determinados valores de Newton(Força).}\n\n" +
        "{Navi possui habilidades reduzidas e não possui controle absoluto das leis da Física.}\n\n" +
        "Não há mais espaço para pensar, pois bem na sua frente está uma bola de aço gigante, " +
        "flutuando a 150m/s\n.\n.\n.\nFerrou.\n\n" +
        "G A M E  O V E R\n");
    } 

    // Chapter 1.1
    private static void cap1Altern1() {
        
        System.out.println("\n~ Você usa seu escudo e, com o impacto, é empurrado para longe até bater contra a parede! " +
        "Um pouco desnorteado após o impacto, você observa o objeto que havia te acertado: Uma enorme bola maciça de metal! " +
        "Então, ao olhar na direção em que a bola foi lançada, você observa um ser. É como se aquela presença preenchesse " +
        "todo o vazio daquela câmara. Logo você o reconheceu: Navi, o Manipulador da Física!\n\n" +
        "{Navi pode alterar a força da gravidade ao seu redor. Ele pode levitar objetos pesados " +
        "com facilidade ou criar campos gravitacionais intensos para atrair ou repelir qualquer coisa em seu alcance.}\n\n" +
        "{Navi possui a habilidade de Controle Cinético e Mecânico. Ele pode aumentar ou diminuir a velocidade de objetos, " +
        "além de ser capaz de aplicar forças com determinados valores de Newton(Força).}" +
        "{Navi possui habilidades reduzidas e não possui controle absoluto das leis da Física.}\n\n" +
        "Navi havia desativado a gravidade da bola de aço e aplicou uma força considerável sobre ela, "+
        "aumentando, assim, sua velocidade drasticamente. É uma verdadeira arma poderosa!" +
        "Mas ainda não acabou!(Insert música de batalha épica here) Rapidamente, Navi cria um campo gravitacional" +
        "sobre você e atrai mais bolas de aços em sua direção. Você pode usar um Super-Salto-Carregado ou " +
        "usar um Super-Tornado ao redor de si! O que você faz?\n" +
        "Digite: Tornado / Salto");

    }


    // Chapter 1.1 - Game Over 
    private static void cap1Altern12() {
        
        System.out.println("\n~ Você resolve formar um Super-Tornado! O poder dos ventos flui ao seu redor " +
        "e então... cessa rapidamente, pois o campo gravitacional sobre você bagunça todas as partículas de ar. " +
        "Além disso, talvez vento não fosse a melhor opção contra bolas de aço gigantes em alta velocidade...\n\n" +
        "G A M E  O V E R\n");
    }

    // Chapter 1.1 - Win
    private static void cap1Altern3() {

        System.out.println("\n~ Você usa o Super-Salto-Carregado! Uma habilidade poderosa, que foi capaz de " +
        "ultrapassar a força do campo gravitacional! Você salta sobre as bolas de aço, que se chocam entre em si. " +
        "No entanto, você não havia calculado que o Super-Salto-Carregado concentraria tanto poder! " +
        "Você agora está subindo em alta velocidade em direção ao teto da câmara. \n\nPOW! " +
        "Você dá de cabeça no teto da câmara! O impacto foi tão forte que fez o teto rachar e começar a cair! " +
        "Um pedaço de teto gigante cai e... POW! Acerta em cheio Navi, o Manipulador da Física, que é esmagado " +
        "num piscar de olhos!\n\nV O C Ê  V E N C E U !\n");
    }
        
    
} 
