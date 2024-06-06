package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Notes;

public interface  NoteRepository extends JpaRepository <Notes, Integer>{
	
	
	public List<Notes> findByIdUtilisateur(Integer idUtilisateur);

}
