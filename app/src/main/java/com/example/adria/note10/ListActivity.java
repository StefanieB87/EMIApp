package com.example.adria.note10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ArrayList<Note> noteList = new ArrayList<Note>();
    private NoteAdapter noteAdapter;
    private ListView noteListView;
    private Button btnNewNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitializeApp();
    }

    private void InitializeApp(){
        //TODO: XML auslesen, noteList initialisieren
        //TODO: GUI Elemente hier initialisieren (gui muss erstmal existieren)

       //noteListView=(ListView)findViewById(R.id.noteList);
        //btnNewNote=(Button)findViewById(R.id.NewNote);
        Log.d("initializing", "NoteListActivity.java");
        //create dummy note to display
        Note note1=new Note();
        Note note2 = new Note ();
        note2.setTitle("Dies ist der Titel");
        //Log.d("note.title", note.getTitle());

        noteList = new ArrayList<Note>();
        noteList.add(note1);
        noteList.add(note2);

        noteAdapter = new NoteAdapter(this, noteList);

        noteListView.setAdapter(noteAdapter);

        btnNewNote.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startNewActivity();
            }
        });

        /*todo: onClickListener NoteListActivity -> starts editNote for the clicked note
            problem: how do i get the pos of the clicked item??
        */

    }

    private void startNewActivity(){
        //TODO:
        // Neue note anlegen
        // Edit activity starten für neue note
        // frage: wie parameter bestimmen, der festlegt, ob zurück button oder delete button bei neuer activtiy
    }

    private void startEditActivity(){
        //TODO: Edit activity starten: Intent i, startActivityForResult(i, ...) -> Activity und Intent Dokumentation
    }

    private void deleteNote(){
        //TODO: note aus notelist löschen
    }
}
