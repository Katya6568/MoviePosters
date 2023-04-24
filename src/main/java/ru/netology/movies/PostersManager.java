package ru.netology.movies;

public class PostersManager {
    String[] posters = new String[0];
    private int postersQuantity;

    public PostersManager() {
        this.postersQuantity = 5;
    }

    public PostersManager(int postersQuantity) {
        this.postersQuantity = postersQuantity;
    }

    public void addMovie(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        int postersLimit;
        if (posters.length < postersQuantity) {
            postersLimit = posters.length;
        } else {
            postersLimit = postersQuantity;
        }
        String[] reversed = new String[postersLimit];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[posters.length - 1 - i];
        }
        return reversed;
    }
}
