package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.security.KeyStore;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    private PosterAdvertising first = new PosterAdvertising(11, 222, "Kill Bill", "Thriller", false);
    private PosterAdvertising second = new PosterAdvertising(22, 333, "Life", "Drama", true);
    private PosterAdvertising third = new PosterAdvertising(33, 444, "People", "drama", true);
    private PosterAdvertising fourth = new PosterAdvertising(44, 555, "Monkey", "drama", true);
    private PosterAdvertising fifth = new PosterAdvertising(55, 666, "Roar", "drama", false);
    private PosterAdvertising sixth = new PosterAdvertising(66, 777, "Planet", "drama", true);
    private PosterAdvertising seventh = new PosterAdvertising(77, 888, "Sky", "drama", false);
    private PosterAdvertising eighth = new PosterAdvertising(88, 999, "Ruler", "drama", true);
    private PosterAdvertising ninth = new PosterAdvertising(99, 1010, "Italy", "drama", true);
    private PosterAdvertising tenth = new PosterAdvertising(10, 1111, "Boy in the skirt", "drama", false);
    private PosterAdvertising eleventh = new PosterAdvertising(101, 1212, "Rumba", "Comedy", false);


    @Test
    public void shouldAddAndGetNotAll() {

        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        PosterAdvertising[] actual = manager.getNotAll();
        PosterAdvertising[] expected = new PosterAdvertising[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddAndGetAll() {

        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        PosterAdvertising[] actual = manager.getAll();
        PosterAdvertising[] expected = new PosterAdvertising[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddAndGetNotAll2() {

        Manager manager = new Manager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        PosterAdvertising[] actual = manager.getNotAll();
        PosterAdvertising[] expected = new PosterAdvertising[]{eleventh, tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddAndGetAll2() {

        Manager manager = new Manager(6);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        PosterAdvertising[] actual = manager.getAll();
        PosterAdvertising[] expected = new PosterAdvertising[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddAndGetNotAll3() {

        Manager manager = new Manager(20);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        PosterAdvertising[] actual = manager.getNotAll();
        PosterAdvertising[] expected = new PosterAdvertising[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }
}
