package LLC;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe Main pour tester les classe du projet ASDVisualiser.
 * 
 * @author Equipe ASDVisualiser - Faculté de Mathématiques et d'informatique
 *         BBA.
 * @version 1.0
 */

public class Test {

	/**
	 * Méthode permetant de Créer une Liste ( {@link LinkedList} ) avec des
	 * valeures entières aléatoires.
	 * 
	 * @param taille
	 *            : Entier
	 * @param L
	 *            {@link LinkedList}
	 */
	public static void ListeAléatoire(int taille, LinkedList L) {
		for (int i = 0; i != taille; i++)
			L.AjouterFin(1 + ThreadLocalRandom.current().nextInt(1,
					100 + 1)); /* Entier Aléatoir entre 1 et 100 */
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Création d'une liste aléatoire.
		System.out.println("\n \n ------------ Création D'une liste ------------ \n \n");
		System.out.println(
				"Pour ce test on va créer une liste Aléatoire L d'entiers dont la taille est Fourni par L'utilisateur");
		System.out.println("Entrer la taille SVP : ");
		
		LinkedList L1 = new LinkedList();
		ListeAléatoire(sc.nextInt(), L1);
		System.out.println("La liste résultante L1 est :");
		System.out.println(L1.toString());

		// Test de l'ajout Début.
		System.out.println("\n \n ------------ Ajout Début ------------ \n \n");
		System.out.println("Entrer un nombre pour l'ajouter au Debut : ");
		L1.AjouterDebut(sc.nextInt());
		System.out.println("La liste résultante L1 est :");
		System.out.println(L1.toString());

		// Test de l'ajout Fin.
		System.out.println("\n \n ------------ Ajout Fin ------------ \n \n");
		System.out.println("Entrer un nombre pour l'ajouter à la Fin : ");
		L1.AjouterFin(sc.nextInt());
		System.out.println("La liste résultante L1 est :");
		System.out.println(L1.toString());

		System.out.println("\n \n ------------ Suppression ------------ \n \n");
		
		LinkedList L2 = new LinkedList();
		// Ajout Des valeurs pour tester les méthodes de suppression.
		L2.AjouterDebut(99);L2.AjouterDebut(1);
		L2.AjouterDebut(2);L2.AjouterDebut(99);
		L2.AjouterDebut(3);L2.AjouterDebut(99);
		System.out.println("La liste L2 avant la suppression.");
		System.out.println(L2.toString());
		
		// Suupression de la valeur 99.
		System.out.println("Suppression de la première occurence de la valeur 99 ");
		L2.Supprimer(99);
		System.out.println(L2.toString());

		// Suupression de la valeur 99.
		System.out.println("Suppression de toutes les occurences la valeur 99 ");
		L2.SupprimerTout(99);
		System.out.println(L2.toString());
	}

}
