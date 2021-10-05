package Noreddine.Model.fr;
import java.util.Scanner;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Menu.menuPrincipal();

        Scanner in = new Scanner(System.in);

        char[][] grille = new char[6][8]; //Tableau

        //initialisation du tableau
        for (int ligne = 0; ligne < grille.length; ligne++) {
            for (int colonne = 0; colonne < grille[0].length; colonne++) {
                grille[ligne][colonne] = ' ';
            }
        }

        int tour = 1;
        char player = '\u25CB';
        boolean gagnant = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        String nomJoueur1;
        String nomJoueur2;

        char p1 = '\u25CB';
        char p2 = '\u25CF';


        System.out.println("Entrez le nom du joueur 1 !");
        nomJoueur1 = scanner.nextLine();

        System.out.println("Entrez le nom du joueur 2 !");
        nomJoueur2 = scanner.nextLine();
        System.out.println("Le joueur au jeton " + p1 + " est : " + nomJoueur1 + "! ");
        System.out.println("Le joueur au jeton " + p2 + " est : " + nomJoueur2 + "! \r\n");

        // choisir en random qui commence
        String j1j2[] = {nomJoueur1, nomJoueur2};
        Random tirageAuSort = new Random();
        int t = tirageAuSort.nextInt(2);
        String resultat = j1j2[t];
        System.out.println("Tu commence " + resultat + " Bonne chance! \n");


            while (gagnant == false && tour <= 42) {
                boolean jeuValide;
                int play;


                do {
                    Affichage.tableauDeJeu(grille);
                    System.out.println("Joueur " + player + ", Choisi une colonne entre 1 et 7 : ");
                    play = in.nextInt();

                    //verifie le choix s'il est valide

                    jeuValide = validation(play, grille);

                } while (jeuValide == false);


                for (int row = grille.length - 1; row >= 0; row--) {
                    if (grille[row][play - 1] == ' ') {
                        grille[row][play - 1] = player;
                        break;
                    }
                }

                //verifier s'il y a un gagnant

                gagnant = leGagnant(player, grille);

                //changement de joueur

                if (player == '\u25CB') {
                    player = '\u25CF';
                } else {
                    player = '\u25CB';
                }

                tour++;
            }

            Affichage.tableauDeJeu(grille);

            //déterminer le gagnant

            if (gagnant) {
                if (player == '\u25CB') {
                    System.out.println(nomJoueur2 + " '\u25CF' A Gagné !!!!");
                    Menu.replay();
                } else {
                    System.out.println(nomJoueur1 + " '\u25CB' A Gagné !!!!");
                    Menu.replay();
                }
            } else {
                System.out.println("Egalité entre " + nomJoueur1 + " et " + nomJoueur2 + " !!!! ");
                Menu.replay();
            }
        }




        public static boolean validation(int colonne, char[][] grille){
            //colonne valide
            if (colonne < 0 || colonne > grille[0].length){
                return false;
            }

            //remplissage colonne
            if (grille[0][colonne] != ' '){
                return false;
            }

            return true;
        }

        public static boolean leGagnant(char player, char[][] grille){
            // verifier le jeu en croix (diagonale)
            for(int ligne = 0; ligne < grille.length; ligne++){
                for (int colonne = 0; colonne < grille[0].length - 3; colonne++){
                    if (grille[ligne][colonne] == player   &&
                            grille[ligne][colonne+1] == player &&
                            grille[ligne][colonne+2] == player &&
                            grille[ligne][colonne+3] == player){
                        return true;
                    }
                }
            }
            //verifier les 4 jeton en vertical et horizontal
            for(int ligne = 0; ligne < grille.length - 3; ligne++){
                for(int colonne = 0; colonne < grille[0].length; colonne++){
                    if (grille[ligne][colonne] == player   &&
                            grille[ligne +1][colonne] == player &&
                            grille[ligne +2][colonne] == player &&
                            grille[ligne +3][colonne] == player){
                        return true;
                    }
                }
            }
            //verifier les jetons en diagonale vers le haut
            for(int ligne = 3; ligne < grille.length; ligne++){
                for(int colonne = 0; colonne < grille[0].length - 3; colonne++){
                    if (grille[ligne][colonne] == player   &&
                            grille[ligne -1][colonne+1] == player &&
                            grille[ligne -2][colonne+2] == player &&
                            grille[ligne -3][colonne+3] == player){
                        return true;
                    }
                }
            }
            //verifier les jetons en diagonale vers le bas
            for(int ligne = 0; ligne < grille.length - 3; ligne++){
                for(int colonne = 0; colonne < grille[0].length - 3; colonne++){
                    if (grille[ligne][colonne] == player   &&
                            grille[ligne+1][colonne+1] == player &&
                            grille[ligne+2][colonne+2] == player &&
                            grille[ligne+3][colonne+3] == player){
                        return true;
                    }
                }
            }
            return false;
        }
    }



