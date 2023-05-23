package ru.startandroid.develop.weaponoftheworld;

public class Weapon {
    // поля сущности
    private String name; // поле названия животного
    private String weaponDescription; // поле описания животного
    private int weaponResource; // поле ресурса животного
    private String yearOfIssue; // поле численности популяции

    // конструктор
    public Weapon(String name, String animalDescription, int animalResource, String populationSize) {
        this.name = name;
        this.weaponDescription = animalDescription;
        this.weaponResource = animalResource;
        this.yearOfIssue = populationSize;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeaponDescription() {
        return weaponDescription;
    }

    public void setWeaponDescription(String weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    public int getWeaponResource() {
        return weaponResource;
    }

    public void setWeaponResource(int weaponResource) {
        this.weaponResource = weaponResource;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

}
