package ru.example.demo.rest;

public enum Metal {

    GOLD("Золото"),

    SILVER("Серебро"),

    PLATINUM("Платина"),

    PALLADIUM("Палладий");

    private final String nameNominative;

    Metal(String nameNominative) {
        this.nameNominative = nameNominative;
    }

    public String getNameNominative() {
        return nameNominative;
    }
}
