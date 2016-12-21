package com.example.adria.note10;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by adria on 16.12.2016.
 */
//ich teste mal was hier passiert wenn ich kommentiere und commite und pushe...
public class EditActivity extends AppCompatActivity {
    Note note;

    // TODO: alle gui Elemente müssen noch hinzugefügt werden.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }
    // TODO: saveNote muss die Notiz Eingabefelder abfragen und abspeichern
    private Note saveNote() {
        return note;
    }
    private void deleteNote() {

    }


}
