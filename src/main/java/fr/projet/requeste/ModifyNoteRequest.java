package requeste;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;

public class ModifyNoteRequest {
	
	private Integer id;
	@NotBlank
	private Integer idUtilisateur;
	@NotBlank
	private String nom;
	@NotBlank
	private String contenu;
	private String description;
	private LocalDateTime dateAjout;
	private LocalDateTime dateModification;


	
	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(LocalDateTime dateAjout) {
		this.dateAjout = dateAjout;
	}
	public LocalDateTime getDateModification() {
		return dateModification;
	}
	public void setDateModification(LocalDateTime dateModification) {
		this.dateModification = dateModification;
	}
}
	



