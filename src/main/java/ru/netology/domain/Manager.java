package ru.netology.domain;

public class Manager {
    private PosterAdvertising[] films = new PosterAdvertising[0];
    private int numbersOfFilmShowed=10;

    public Manager(int numbersOfFilmShowed) {
        this.numbersOfFilmShowed = numbersOfFilmShowed;
    }
    public Manager () {

    }

    public void add(PosterAdvertising film) {
        int length = films.length + 1;
        PosterAdvertising[] tmp = new PosterAdvertising[length];

        System.arraycopy(films, 0, tmp, 0, films.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public PosterAdvertising[] getNotAll() {
        int resultLength;
        if (films.length > numbersOfFilmShowed) {
            resultLength=numbersOfFilmShowed;
        } else {
            resultLength=films.length;
        }
        PosterAdvertising[] result = new PosterAdvertising[resultLength];
           for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
    public PosterAdvertising[] getAll() {

        PosterAdvertising[] result = new PosterAdvertising[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }


}

