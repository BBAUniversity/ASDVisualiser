package LLC;

/**
 * Classe regroupe les opérations sur les listes linéaires chainées. Cette
 * classe permet de :
 * <ul>
 * <li>Supprimer une seule occurrence d'une valeur.</li>
 * <li>Supprimer toutes les occurrences d'une valeur.</li>
 * <li>Ajouter un noeud au début de la liste.</li>
 * <li>Akouter un noeud à la fin de la liste.</li>
 * <li>Parcourir la liste.</li>
 * </ul>
 * 
 * @author Equipe ASDVisualiser - Faculté de Mathématiques et d'informatique
 *         BBA.
 * @version 1.0
 */

public class LinkedList {

	// Les attributs de la liste linéaire chainée.
	/**
	 * Nombre des Noeuds
	 */
	private int taille;
	/**
	 * Référence de Premier élément de la liste
	 */
	private Noeud Tete;
	/**
	 * Référence De dernier élément de la Liste
	 */
	private Noeud Queue;

	// Implémentation des constructeurs de création d'une liste linéaire
	// chainée.

	/**
	 * Constructeur Par Défaut(Vide)
	 */
	public LinkedList() {
		Tete = null;
		Queue = Tete;
		taille = 0;
	}

	/**
	 * Constructeur d'une liste avec un seul {@link Noeud} contenant une valeur
	 * 
	 * @param Valeur
	 *            : Entier
	 */
	public LinkedList(int Valeur) {
		Tete = new Noeud(Valeur);
		Queue = Tete;
		taille = 1;
	}

	// Les Accesseurs et les mutateurs.
	/**
	 * Accesseur qui retourne la taille de la liste.
	 * 
	 * @return taille : Entier .
	 */
	public int getTaille() {
		return this.taille;
	}

	/**
	 * Accesseur qui retourne une réference sur le premier {@link Noeud} de la
	 * liste.
	 * 
	 * @return Tete : {@link Noeud} .
	 */
	public Noeud getTete() {
		return this.Tete;
	}

	/**
	 * Accesseur qui retourne une réference sur le dernier {@link Noeud} de la
	 * liste
	 * 
	 * @return Queue : {@link Noeud}
	 */
	public Noeud getQueue() {
		return this.Queue;

	}

	// Implémentation des opérations sur la liste linéaire chainée.

	/**
	 * Méthode permetant d'ajouter un nouveau Noeud au début de la liste.
	 * 
	 * @param valeur
	 *            : Entier
	 */
	public void AjouterDebut(int valeur) {
		// creation d'un nouveau noeud 'nv'.
		Noeud nv = new Noeud(valeur, null);
		if (Tete == null) {
			// Si la liste est vide, on inisialise la Tete par nv et la Queue
			// par nv(tete).
			Tete = nv;
			Queue = Tete;
		} else {
			// Si la liste n'est pas vide, le nouveau noued nv sera la nouvelle
			// Tete de la
			// liste tout en pointant sur l'ancien Tete.
			nv.setSuivant(Tete);
			Tete = nv;
		}
		// Incrementation de la taille de liste.
		taille++;
	}

	/**
	 * Methode permetant d'ajouter un nouveau Noeud a la fin de la liste
	 * 
	 * @param Valeur
	 *            :Entier
	 */
	public void AjouterFin(int Valeur) {
		Noeud nv = new Noeud(Valeur, null);
		if (Tete == null) {
			// Si la liste est vide alors le noeud ajouté sera la tête de la
			// liste.
			Tete = nv;
		} else {
			// Si la liste n'est pas vide alors le noeud est chainé avec la
			// Queue de la liste.
			Queue.setSuivant(nv);
		}
		Queue = nv;
		// l'incrementation de la taille de liste
		taille++;
	}

	/**
	 * Méthode permettant à supprimer le {@link Noeud} qui contient le premier
	 * occurrence d'une valeur s'il elle existe dans la liste.
	 * 
	 * @param Valeur
	 *            : Entier
	 * @return Booleén. .
	 */
	public boolean Supprimer(int Valeur) {
		// Variable booléenne
		boolean SiSupp = false;
		// Si la liste est vide, un message est affiché et on retourne "false"
		if (Tete == null) {
			System.out.println("La liste est vide");
			return SiSupp;
		} else {
			// *Si la valeur est trouvée dans le premier noeud on retourne true
			if (Tete.getValeur() == Valeur) {
				Tete = Tete.getSuivant();
				SiSupp = true;
				// Décrémentation de la taille
				taille--;
			}
			// Si la condition précédente n'est pas satisfaite, on cherche à
			// Valeur dans le reste de la liste.
			else {
				Noeud NoeudAvantSupp = Tete;
				Noeud NoeudàSupp = Tete.getSuivant();
				while ((NoeudàSupp.getValeur() != Valeur) && (NoeudàSupp != null)) {
					NoeudAvantSupp = NoeudAvantSupp.getSuivant();
					NoeudàSupp = NoeudàSupp.getSuivant();
					if (NoeudàSupp == null) {
						break;
					}
				}
				// Si la valeur recherchée existe dans la liste,on passe à la
				// suppression de la valeur
				if (NoeudàSupp != null) {
					NoeudàSupp = NoeudàSupp.getSuivant();
					NoeudAvantSupp.setSuivant(NoeudàSupp);
					SiSupp = true;
					// Decrementation de la taille
					taille--;
				}
			}
			return SiSupp;
		}
	}

	// Methode sert a supprimer toutes les occurences d'une valeur donner
	/**
	 * Methode pour la suppression de toutes les occurences d'une valeur donneé.
	 * 
	 * @param Valeur
	 *            : Entier
	 * @return True si la valeur est supprimée sinon false. .
	 */
	public boolean SupprimerTout(int Valeur) {
		boolean supp = true;
		// La méthode supprimer est utilisée en boucle pour supprimer toutes les
		// occurences.
		while (supp) {
			if (this.Supprimer(Valeur))
				supp = true;
			else
				supp = false;
		}
		return supp;
	}

	/**
	 * Retourne une chaine de caracters pour afficher la liste.
	 * 
	 * @return Chaîne de caractères.
	 */
	@Override
	public String toString() {
		String text = "";
		if (Tete == null) {
			text = "la liste est vide";
		} else {
			Noeud parcour = Tete;
			for (int i = 0; i < taille; i++) {
				text += "[" + parcour.getValeur() + "] --> ";
				parcour = parcour.getSuivant();
			}
		}
		return text + "NIL";
	}

}
