package Noreddine.Model.fr;
import java.util.Scanner;

public class Menu {

    private static Object Program;

    public static void menuPrincipal() {
        int input; //Variable dans la quel sera stocker le choix du joueur
        System.out.println();
        do { //Menu principale
            System.out.println("((****************************************))\r\n"
                    + "  ))) Bienvenue sur le Jeu Puissance 4 ((( \r\n"
                    + "((****************************************))\r\n");
            System.out.println("********** Entrer le Numéro -1- Pour Jouer *********");
            System.out.println("********** Entrer le Numéro -0- Pour Quitter *******");

            Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();

            //Une condition qui verifie si le joueur a bien rentré 0 ou 1, si le joueur rentre autre chose que 0 ou 1 on lui demande de rentrer l'un des deux chiffres

            if(input == 0) {
                TheEnd();
            }else if (input == 1) {
                System.out.println("Bonjour !");
            }else{
                System.out.println("!!! Veuillez entrer 1 ou 0, Pour continuer !!!\r\n");
            }
        } while(input != 1 && input != 0); // on continue a demander au joueur de rentrer un numéro valide
    }

    // méthode replay qui renvoi les joueurs au menu principale en cas de victoire defaite ou égalité
    public static void replay() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez-vous jouer une autre partie ? O/N");
        scanner.nextLine();
        String result;
        result = scanner.nextLine();
        switch (result){
            case "O":
            case "o":
                System.out.println("Trop Bien, Encore une autre !!");
                Menu.menuPrincipal(); // amélioration du program pour afficher les noms des deux joueurs quand ils rejouent en cours ..... dsl
                break;
                case "N":
                case "n":
                TheEnd();
                    break;
            default:
                break;
        }

    }
    // méthode qui met fin au jeu
    public static void TheEnd() {
        System.out.println("((****************************************))\r\n"
                + "  ))) A bientot sur le Jeu Puissance 4 ((( \r\n"
                + "((****************************************))\r\n");
        System.exit(0);
    }
}
