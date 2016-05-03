package LLC;

/**
 * Classe regroupe tous les attributs et les m�thodes d'un noeud. Cette classe
 * permet la : 
 * 
 * <ul>
 * <li>Cr�ation d'un nouveau noeud dans une liste lin�aire chain�e.</li>
 * <li>Manipulation du contenu de ce noeud</li>
 * </ul>
 * 
 * @author Equipe ASDVisualiser - Facult� de Math�matiques et d'informatique
 *         BBA.
 * @version 1.0
 */

public class Noeud {

	// Les attributs d'un noeud.

	/**
	 * Champ Valeur : Entier
	 */
	private int Valeur;

	/**
	 * Champ Suivant : R�f�rence vers le Noeud suivant
	 */
	private Noeud Suivant;

	// L'impl�mentation des constructeurs de cr�ation d'un nouveau noeud.

	/**
	 * Constructeur Par D�faut(Vide)
	 */
	public Noeud() {
		Valeur = 0;
		Suivant = null;
	}

	/**
	 * Constructeur pour initialiser un nouveau n�ud par une valeur enti�re.
	 * 
	 * @param Valeur
	 *            Entier
	 */
	public Noeud(int Valeur) {
		this.Valeur = Valeur;
		Suivant = null;
	}

	/**
	 * Constructeur pour initialiser un nouveau n�ud par une valeur enti�re tout
	 * en faisant le chainage avec le noeud Suivant.
	 * 
	 * @param Valeur
	 *            Entier
	 * @param Suivant
	 *            {@link Noeud}
	 */
	public Noeud(int Valeur, Noeud Suivant) {
		this.Suivant = Suivant;
		this.Valeur = Valeur;

	}

	// Manipulation des valeurs en utilisant les Accesseurs et les mutateurs.

	/**
	 * Accesseur permet de retourner la Valeur du Noeud.
	 * 
	 * @return Valeur : Entier
	 */
	public int getValeur() {
		return Valeur;

	}

	/**
	 * Mutateur consiste � Modifier la valeur du Noeud.
	 * 
	 * @param Valeur
	 *            Entier
	 */
	public void setValeur(int Valeur) {
		this.Valeur = Valeur;

	}

	/**
	 * Accesseur permet de retourner une r�f�rence sur le Noeud Suivant.
	 * 
	 * @return Suivant : {@link Noeud}
	 */
	public Noeud getSuivant() {
		return Suivant;

	}

	/**
	 * Mutateur permet de modifier la r�ference Suivant du Noeud.
	 * 
	 * @param Suivant
	 *            {@link Noeud}
	 */
	public void setSuivant(Noeud Suivant) {
		this.Suivant = Suivant;

	}
}
