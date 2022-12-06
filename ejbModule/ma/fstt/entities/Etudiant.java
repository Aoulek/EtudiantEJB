package ma.fstt.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity

public class Etudiant implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_etudiant;
	private String nom;
	private String prénom;
	private String cne;
	private String adresse;
	private String niveau;
	private static final long serialVersionUID = 1L;
	
	public Etudiant(int id_etudiant, String nom, String prénom, String cne,
			String adresse, String niveau) {
		super();
		this.id_etudiant = id_etudiant;
		this.nom = nom;
		this.prénom = prénom;
		this.cne = cne;
		this.adresse = adresse;
		this.niveau = niveau;
	}

	public Etudiant() {
		super();
	}   
	public int getId_etudiant() {
		return this.id_etudiant;
	}

	public void setId_etudiant(int id_etudiant) {
		this.id_etudiant = id_etudiant;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrénom() {
		return this.prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}   
	public String getCne() {
		return this.cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public String getNiveau() {
		return this.niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
   
}
