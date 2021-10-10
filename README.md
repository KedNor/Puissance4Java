# Puissance4

Le but du jeu est d'aligner une suite de 4 pions de même couleur sur une grille comptant 6 rangées et 7 colonnes. Chaque joueur dispose de 21 pions d'une couleur (par convention, en général jaune ou rouge). Tour à tour, les deux joueurs placent un pion dans la colonne de leur choix, le pion coulisse alors jusqu'à la position la plus basse possible dans la dite colonne à la suite de quoi c'est à l'adversaire de jouer. Le vainqueur est le joueur qui réalise le premier un alignement (horizontal, vertical ou diagonal) consécutif d'au moins quatre pions de sa couleur. Si, alors que toutes les cases de la grille de jeu sont remplies, aucun des deux joueurs n'a réalisé un tel alignement, la partie est déclarée nulle. Source https://fr.wikipedia.org/wiki/Puissance_4



Implémentation technique du jeu et Notice d'utilisation :

 -1- Début de la partie avec un message de bienvenue et un Menu (2 Choix s'offre aux joueurs -1-Jouer -0-Quitter)
  ![Capture d’écran 2021-10-10 223640](https://user-images.githubusercontent.com/49998325/136712349-78dbfa0c-584f-4f3b-bab3-333d287f0be1.jpg)
  
 -2- Renseignement des noms des joueurs (Les deux joueurs doivent renseigner leurs noms pour jouer)
              
  ![Capture d’écran 2021-10-10 224343](https://user-images.githubusercontent.com/49998325/136712502-db988279-94e4-4e8e-8b57-105b68d2825e.jpg)
  
 -3- Affichage des noms, assignation des jetons aux joueurs (Jetons noir au 1er joueur, et Jeton blanc au 2eme Joueur) et Tirage au sort pour savoir qui joue en premier
 
 ![Capture d’écran 2021-10-10 224726](https://user-images.githubusercontent.com/49998325/136712707-eb1ae858-e9ee-4e6e-9f30-0d96d51b5f6a.jpg)
 
*******Warning***** Une amélioration est prévue pour afficher le prenom des joueur au lieu des Jetons et améliorer le Random

-4-Jouer !!!

   - Le Tableau contient 7 colonne et chaque colonne représente un numéro allant de de 1 a 7 
   - A chaque tour, un joueur doit renseigner un numéro de colonne pour déposer son jeton, si le joueur aligne 4 jetons, Il gagne !
   - A la fin de la partie, le nom du vainqueur et son Jeton sont affichés et le jeu nous demandes si on veut rejouer, O/N.
      
![Capture d’écran 2021-10-10 230630](https://user-images.githubusercontent.com/49998325/136712989-cce1e8f0-5d0a-483b-9281-d18a57d974e2.jpg)
  
 



