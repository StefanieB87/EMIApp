package com.example.adria.note10;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by adria on 19.12.2016.
 */

public class NoteAdapter extends ArrayAdapter<Note>{
    //TODO:GUI ELEMNTE
    private final Context context;
    private final ArrayList<Note> noteList;
    public NoteAdapter(Context context, ArrayList<Note> noteList) {
        super(context, R.layout.list_row);
        this.context = context;
        this.noteList = noteList;

    }
}
