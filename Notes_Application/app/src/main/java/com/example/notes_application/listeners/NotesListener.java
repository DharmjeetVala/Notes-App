package com.example.notes_application.listeners;

import com.example.notes_application.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
