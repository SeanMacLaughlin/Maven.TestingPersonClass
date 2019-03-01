package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int yearsOfCollege;
    private String eyeColor;
    private int maxBench;
    private String favSong;
    private String favCity;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.yearsOfCollege = 0;
        this.maxBench = 0;
        this.favSong = "";
        this.favCity = "";
        this.eyeColor = "";

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String eyeColor, String favCity, String favSong, int maxBench, int yearsOfCollege) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.favCity = favCity;
        this.favSong = favSong;
        this.maxBench = maxBench;
        this.yearsOfCollege = yearsOfCollege;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getYearsOfCollege() {
        return yearsOfCollege;
    }

    public void setYearsOfCollege(int yearsOfCollege) {
        this.yearsOfCollege = yearsOfCollege;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getMaxBench() {
        return maxBench;
    }

    public void setMaxBench(int maxBench) {
        this.maxBench = maxBench;
    }

    public String getFavSong() {
        return favSong;
    }

    public void setFavSong(String favSong) {
        this.favSong = favSong;
    }

    public String getFavCity() {
        return favCity;
    }

    public void setFavCity(String favCity) {
        this.favCity = favCity;
    }

}
