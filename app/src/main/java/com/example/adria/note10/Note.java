package com.example.adria.note10;

import android.provider.MediaStore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by adria on 16.12.2016.
 */

public class Note implements Serializable {
    private Category category;
    private String text;
    private String title;
    private Date created;
    private Date edited;
    // TODO: hier soll die Audiodatei hin.
    private ArrayList<MediaStore.Audio> audioList;
    public Note() {
        created = new Date();
        audioList = new ArrayList<>();
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getEdited() {
        return edited;
    }

    public void setEdited() {
        edited = new Date();
    }
    // Meciastore.audio nur platzhalter
    public ArrayList<MediaStore.Audio> getAudioList() {
        return audioList;
    }

    public void setAudioList(ArrayList<MediaStore.Audio> audioList) {
        this.audioList = audioList;
    }
    public boolean hasAudio() {
        //// TODO: nicht fertig
        return false;
    }
    public boolean hasText() {
        // TODO: nicht fertig
        return true;
    }
    public int playAudio() {
        // TODO: nicht fertig
        return 0;
    }
    public void startAudioRec() {
        //TODO: nicht fertig
    }
    public void stopAudioRec() {
        //// TODO: nicht fertig
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
