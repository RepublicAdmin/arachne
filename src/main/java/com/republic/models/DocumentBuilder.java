package com.republic.models;


public class DocumentBuilder {

    private String nazwaPliku;
    private String urlPliku;
    private String opisPliku;

    public DocumentBuilder() {
    }

    public static DocumentBuilder onDocumentBuilder(){
        return new DocumentBuilder();
    }

    public DocumentBuilder withNazwaPliku(String nazwaPliku) {
        this.nazwaPliku = nazwaPliku;
        return this;
    }

    public DocumentBuilder withUrlPliku(String urlPliku) {
        this.urlPliku = urlPliku;
        return this;
    }

    public DocumentBuilder withOpisPliku(String opisPliku) {
        this.opisPliku = opisPliku;
        return this;
    }

    public Document build(){
        return new Document(this.nazwaPliku,this.urlPliku,this.opisPliku);
    }
}
