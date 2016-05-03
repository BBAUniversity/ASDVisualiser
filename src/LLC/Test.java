package LLC;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe Main pour tester les classe du projet ASDVisualiser.
 * 
 * @author Equipe ASDVisualiser - Facult� de Math�matiques et d'informatique
 *         BBA.
 * @version 1.0
 */

public class Test {

	/**
	 * M�thode permetant de Cr�er une Liste ( {@link LinkedList} ) avec des
	 * valeures enti�res al�atoires.
	 * 
	 * @param taille
	 *            : Entier
	 * @param L
	 *            {@link LinkedList}
	 */
	public static void ListeAl�atoire(int taille, LinkedList L) {
		for (int i = 0; i != taille; i++)
			L.AjouterFin(1 + ThreadLocalRandom.current().nextInt(1,
					100 + 1)); /* Entier Al�atoir entre 1 et 100 */
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Cr�ation d'une liste al�atoire.
		System.out.println("\n \n ------------ Cr�ation D'une liste ------------ \n \n");
		System.out.println(
				"Pour ce test on va cr�er une liste Al�atoire L d'entiers dont la taille est Fourni par L'utilisateur");
		System.out.println("Entrer la taille SVP : ");
		
		LinkedList L1 = new LinkedList();
		ListeAl�atoire(sc.nextInt(), L1);
		System.out.println("La liste r�sultante L1 est :");
		System.out.println(L1.toString());

		// Test de l'ajout D�but.
		System.out.println("\n \n ------------ Ajout D�but ------------ \n \n");
		System.out.println("Entrer un nombre pour l'ajouter au Debut : ");
		L1.AjouterDebut(sc.nextInt());
		System.out.println("La liste r�sultante L1 est :");
		System.out.println(L1.toString());

		// Test de l'ajout Fin.
		System.out.println("\n \n ------------ Ajout Fin ------------ \n \n");
		System.out.println("Entrer un nombre pour l'ajouter � la Fin : ");
		L1.AjouterFin(sc.nextInt());
		System.out.println("La liste r�sultante L1 est :");
		System.out.println(L1.toString());

		System.out.println("\n \n ------------ Suppression ------------ \n \n");
		
		LinkedList L2 = new LinkedList();
		// Ajout Des valeurs pour tester les m�thodes de suppression.
		L2.AjouterDebut(99);L2.AjouterDebut(1);
		L2.AjouterDebut(2);L2.AjouterDebut(99);
		L2.AjouterDebut(3);L2.AjouterDebut(99);
		System.out.println("La liste L2 avant la suppression.");
		System.out.println(L2.toString());
		
		// Suupression de la valeur 99.
		System.out.println("Suppression de la premi�re occurence de la valeur 99 ");
		L2.Supprimer(99);
		System.out.println(L2.toString());

		// Suupression de la valeur 99.
		System.out.println("Suppression de toutes les occurences la valeur 99 ");
		L2.SupprimerTout(99);
		System.out.println(L2.toString());
	}

}
