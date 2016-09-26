package com.republic.models;

public class Document {
    private final String nazwaPliku;
    private final String urlPliku;
    private final String opisPliku;

    public Document() {
        this.nazwaPliku = "";
        this.urlPliku = "";
        this.opisPliku = "";
    }

    public Document(String nazwaPliku, String urlPliku, String opisPliku) {
        this.nazwaPliku = nazwaPliku;
        this.urlPliku = urlPliku;
        this.opisPliku = opisPliku;
    }

    public String getNazwaPliku() {
        return nazwaPliku;
    }

    public String getUrlPliku() {
        return urlPliku;
    }

    public String getOpisPliku() {
        return opisPliku;
    }

    @Override
    public String toString() {
        return "Document{" +
                "nazwaPliku='" + nazwaPliku + '\'' +
                ", urlPliku='" + urlPliku + '\'' +
                ", opisPliku='" + opisPliku + '\'' +
                '}';
    }


}
