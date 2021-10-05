package Noreddine.Model.fr;

public class Affichage {
    // affichage du tableau de jeu
    public static void tableauDeJeu(char[][] grille){
        System.out.println("########-PUISSANCE-4-########");
        System.out.println("  1   2   3   4   5   6   7 ");
        System.out.println("*---+---+---+---+---+---+---*");
        for (int ligne = 0; ligne < grille.length; ligne++){
            System.out.print("| ");
            for (int colonne = 0; colonne < grille[0].length-1; colonne++){
                System.out.print(grille[ligne][colonne]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("*---+---+---+---+---+---+---*");
        }
        System.out.println("  1   2   3   4   5   6   7 ");
        System.out.println();
    }
}
