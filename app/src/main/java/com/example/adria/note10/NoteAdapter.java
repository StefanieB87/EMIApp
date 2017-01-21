package com.example.adria.note10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by adria on 19.12.2016.
 * NoteAdapter connects the note to activity_edit gui
 */

public class NoteAdapter extends ArrayAdapter<Note>{
    //TODO:GUI ELEMNTE
    private final Context context;
    private final ArrayList<Note> noteList;
    private ImageView audioIcon;
    private android.widget.ImageView textIcon;
    private TextView titleView;

    public NoteAdapter(Context context, ArrayList<Note> noteList) {
        super(context, R.layout.list_row);
        this.context = context;
        this.noteList = noteList;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //create inflater
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        //get row view from infltaer
        View rowView = inflater.inflate(R.layout.list_row, parent, false);

        //get fields from XML to be filled with data
        //in the constructor, list_row is passed as argument
        //audioIcon = (ImageView) rowView.findViewById(R.id.audio);
        textIcon = (ImageView) rowView.findViewById(R.id.text);
        titleView = (TextView) rowView.findViewById(R.id.title);

        //set content
        /* TODO: 16.11.16 is it better to let the Note return icon/no icon or to do it like this
            (Adapter only gets boolean information on whether audio/text exists and eventually grabs the icon itself)
        */
        if(noteList.get(position).hasAudio()){
            //// TODO: this does not work
            //audioIcon.setImageDrawable(R.drawable.recordedAudio);
        };

        if (noteList.get(position).hasText()){
            // TODO: 16.11.16 this also does not work out jet, of course
            //textIcon.setImageDrawable(R.drawable.text);
        }

        titleView.setText(noteList.get(position).getTitle());


        // 5. return rowView
        return rowView;
    }
}
