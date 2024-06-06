package api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Notes;
import service.NoteService;

@RestController
@RequestMapping("/api/notes")
public class NoteRestController {

    @Autowired
    private NoteService noteService;

    

    //@GetMapping
   // public List<Note> getAllNotes( authentication) {
       // User currentUser = userService.findUserByUsername(authentication.getName());
       // return noteService.getNotesByUserId(currentUser.getId());
   // }

    @GetMapping("/{id}")
    public List<Notes> getNoteById(@PathVariable Integer id ) {
       List<Notes> currentNote = noteService.getNotesByUtilisateurId(id);
       
        if (currentNote != null ) {
        	
            return currentNote;
        }
        return null; // Or throw an exception
    }

    @PostMapping
    public Notes createNote(@RequestBody Notes note) {
       
        return noteService.saveNote(note);
    }

   // @PutMapping("/{id}")
    //public Note updateNote(@PathVariable Long id, @RequestBody Note note, Authentication authentication) {
       // User currentUser = userService.findUserByUsername(authentication.getName());
       // Note existingNote = noteService.getNoteById(id);
        //if (existingNote != null && existingNote.getUser().getId().equals(currentUser.getId())) {
         //   existingNote.setName(note.getName());
         //   existingNote.setDescription(note.getDescription());
          //  existingNote.setContent(note.getContent());
            //return noteService.saveNote(existingNote);
       // }
        //return null; // Or throw an exception
  //  }

    
    
   // @DeleteMapping("/{id}")
   // public void deleteNoteById(@PathVariable Integer id, Authentication authentication) {
       // User currentUser = userService.findUserByUsername(authentication.getName());
     //   Note note = noteService.getNoteById(id);
  //      if (note != null && note.getUser().getId().equals(currentUser.getId())) {
     //       noteService.deleteNoteById(id);
     //   }
   // }
}
