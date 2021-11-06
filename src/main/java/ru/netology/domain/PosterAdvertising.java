package ru.netology.domain;

public class PosterAdvertising {
    private int id;
    private int filmId;
    private String filmName;
    private String filmType;
    private boolean premiereTomorrow;

    public PosterAdvertising(int id, int filmId, String filmName, String filmType, boolean premiereTomorrow) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmType = filmType;
        this.premiereTomorrow = premiereTomorrow;
    }


}
