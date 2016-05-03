package LLC;

/**
 * Classe regroupe les op�rations sur les listes lin�aires chain�es. Cette
 * classe permet de :
 * <ul>
 * <li>Supprimer une seule occurrence d'une valeur.</li>
 * <li>Supprimer toutes les occurrences d'une valeur.</li>
 * <li>Ajouter un noeud au d�but de la liste.</li>
 * <li>Akouter un noeud � la fin de la liste.</li>
 * <li>Parcourir la liste.</li>
 * </ul>
 * 
 * @author Equipe ASDVisualiser - Facult� de Math�matiques et d'informatique
 *         BBA.
 * @version 1.0
 */

public class LinkedList {

	// Les attributs de la liste lin�aire chain�e.
	/**
	 * Nombre des Noeuds
	 */
	private int taille;
	/**
	 * R�f�rence de Premier �l�ment de la liste
	 */
	private Noeud Tete;
	/**
	 * R�f�rence De dernier �l�ment de la Liste
	 */
	private Noeud Queue;

	// Impl�mentation des constructeurs de cr�ation d'une liste lin�aire
	// chain�e.

	/**
	 * Constructeur Par D�faut(Vide)
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
	 * Accesseur qui retourne une r�ference sur le premier {@link Noeud} de la
	 * liste.
	 * 
	 * @return Tete : {@link Noeud} .
	 */
	public Noeud getTete() {
		return this.Tete;
	}

	/**
	 * Accesseur qui retourne une r�ference sur le dernier {@link Noeud} de la
	 * liste
	 * 
	 * @return Queue : {@link Noeud}
	 */
	public Noeud getQueue() {
		return this.Queue;

	}

	// Impl�mentation des op�rations sur la liste lin�aire chain�e.

	/**
	 * M�thode permetant d'ajouter un nouveau Noeud au d�but de la liste.
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
			// Si la liste est vide alors le noeud ajout� sera la t�te de la
			// liste.
			Tete = nv;
		} else {
			// Si la liste n'est pas vide alors le noeud est chain� avec la
			// Queue de la liste.
			Queue.setSuivant(nv);
		}
		Queue = nv;
		// l'incrementation de la taille de liste
		taille++;
	}

	/**
	 * M�thode permettant � supprimer le {@link Noeud} qui contient le premier
	 * occurrence d'une valeur s'il elle existe dans la liste.
	 * 
	 * @param Valeur
	 *            : Entier
	 * @return Boole�n. .
	 */
	public boolean Supprimer(int Valeur) {
		// Variable bool�enne
		boolean SiSupp = false;
		// Si la liste est vide, un message est affich� et on retourne "false"
		if (Tete == null) {
			System.out.println("La liste est vide");
			return SiSupp;
		} else {
			// *Si la valeur est trouv�e dans le premier noeud on retourne true
			if (Tete.getValeur() == Valeur) {
				Tete = Tete.getSuivant();
				SiSupp = true;
				// D�cr�mentation de la taille
				taille--;
			}
			// Si la condition pr�c�dente n'est pas satisfaite, on cherche �
			// Valeur dans le reste de la liste.
			else {
				Noeud NoeudAvantSupp = Tete;
				Noeud Noeud�Supp = Tete.getSuivant();
				while ((Noeud�Supp.getValeur() != Valeur) && (Noeud�Supp != null)) {
					NoeudAvantSupp = NoeudAvantSupp.getSuivant();
					Noeud�Supp = Noeud�Supp.getSuivant();
					if (Noeud�Supp == null) {
						break;
					}
				}
				// Si la valeur recherch�e existe dans la liste,on passe � la
				// suppression de la valeur
				if (Noeud�Supp != null) {
					Noeud�Supp = Noeud�Supp.getSuivant();
					NoeudAvantSupp.setSuivant(Noeud�Supp);
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
	 * Methode pour la suppression de toutes les occurences d'une valeur donne�.
	 * 
	 * @param Valeur
	 *            : Entier
	 * @return True si la valeur est supprim�e sinon false. .
	 */
	public boolean SupprimerTout(int Valeur) {
		boolean supp = true;
		// La m�thode supprimer est utilis�e en boucle pour supprimer toutes les
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
	 * @return Cha�ne de caract�res.
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
