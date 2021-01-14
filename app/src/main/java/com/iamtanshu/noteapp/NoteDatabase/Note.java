package com.iamtanshu.noteapp.NoteDatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName ="note_table")
public class Note {
    @PrimaryKey(autoGenerate =true)
    private int id;
    private String title;
    private String decription;
    private int priority;

    public Note(String title, String decription, int priority) {
        this.title = title;
        this.decription = decription;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDecription() {
        return decription;
    }

    public int getPriority() {
        return priority;
    }
}
