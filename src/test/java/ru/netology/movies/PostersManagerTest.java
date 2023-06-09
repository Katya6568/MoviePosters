package ru.netology.movies;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PostersManagerTest {

    @Test
    public void shouldAddMovies() {
        PostersManager manager = new PostersManager();

        manager.addMovie("Буратино");
        manager.addMovie("Вулканы");
        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");
        manager.addMovie("Любовь");

        manager.findAll();

        String[] expected = {"Буратино", "Вулканы", "Ложный след", "Пираты", "Любовь"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {
        PostersManager manager = new PostersManager();

        manager.addMovie("Буратино");

        manager.findAll();

        String[] expected = {"Буратино"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesIfFive() {
        PostersManager manager = new PostersManager(5);
        manager.addMovie("Буратино");
        manager.addMovie("Вулканы");
        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");
        manager.addMovie("Любовь");

        manager.findLast();

        String[] expected = {"Любовь", "Пираты", "Ложный след", "Вулканы", "Буратино"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesIfThree() {
        PostersManager manager = new PostersManager();

        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");
        manager.addMovie("Любовь");

        manager.findLast();

        String[] expected = {"Любовь", "Пираты", "Ложный след"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesIfSeven() {
        PostersManager manager = new PostersManager(7);

        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");
        manager.addMovie("Любовь");
        manager.addMovie("Кошки");
        manager.addMovie("Майкл");
        manager.addMovie("100 обещаний");
        manager.addMovie("Буратино");

        manager.findLast();

        String[] expected = {"Буратино", "100 обещаний", "Майкл", "Кошки", "Любовь", "Пираты", "Ложный след"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoviesIfFive() {
        PostersManager manager = new PostersManager(5);
        manager.addMovie("Буратино");
        manager.addMovie("Вулканы");
        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");
        manager.addMovie("Любовь");

        manager.findAll();

        String[] expected = {"Буратино", "Вулканы", "Ложный след", "Пираты", "Любовь"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoviesIfThree() {
        PostersManager manager = new PostersManager();

        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");
        manager.addMovie("Любовь");

        manager.findAll();

        String[] expected = {"Ложный след", "Пираты", "Любовь"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoviesIfSeven() {
        PostersManager manager = new PostersManager(7);

        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");
        manager.addMovie("Любовь");
        manager.addMovie("Кошки");
        manager.addMovie("Майкл");
        manager.addMovie("100 обещаний");
        manager.addMovie("Буратино");

        manager.findAll();

        String[] expected = {"Ложный след", "Пираты", "Любовь", "Кошки", "Майкл", "100 обещаний", "Буратино"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesEqualToLimit() {
        PostersManager manager = new PostersManager(4);
        manager.addMovie("Буратино");
        manager.addMovie("Вулканы");
        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");

        manager.findLast();

        String[] expected = {"Пираты", "Ложный след", "Вулканы", "Буратино"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesUnderLimit() {
        PostersManager manager = new PostersManager(6);
        manager.addMovie("Буратино");
        manager.addMovie("Вулканы");
        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");
        manager.addMovie("Любовь");


        manager.findLast();

        String[] expected = {"Любовь", "Пираты", "Ложный след", "Вулканы", "Буратино"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesOverLimit() {
        PostersManager manager = new PostersManager(6);
        manager.addMovie("Буратино");
        manager.addMovie("Вулканы");
        manager.addMovie("Ложный след");
        manager.addMovie("Пираты");
        manager.addMovie("Любовь");
        manager.addMovie("Тайна сокровищ");
        manager.addMovie("Майкл");

        manager.findLast();

        String[] expected = {"Майкл", "Тайна сокровищ", "Любовь", "Пираты", "Ложный след", "Вулканы"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}