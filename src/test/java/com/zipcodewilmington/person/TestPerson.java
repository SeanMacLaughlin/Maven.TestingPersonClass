package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetMaxBench() {
        // Given
        Person person = new Person();
        int expected = 295;

        // When
        person.setMaxBench(expected);

        // Then
        int actual = person.getMaxBench();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetFavCity() {
        // Given
        Person person = new Person();
        String expected = "Philly";

        // When
        person.setFavCity(expected);

        // Then
        String actual = person.getFavCity();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetFavSong() {
        // Given
        Person person = new Person();
        String expected = "Never Gonna Give You Up";

        // When
        person.setFavSong(expected);

        // Then
        String actual = person.getFavSong();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetYearsOfCollege() {
        // Given
        Person person = new Person();
        int expected = 6;

        // When
        person.setYearsOfCollege(expected);

        // Then
        int actual = person.getYearsOfCollege();
        Assert.assertEquals(expected, actual);

    }
}
