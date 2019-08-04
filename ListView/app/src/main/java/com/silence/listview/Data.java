package com.silence.listview;

public class Data {
    private String text;
    private int imageID;

    public Data(String text, int imageID) {
        this.text = text;
        this.imageID = imageID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
