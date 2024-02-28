package com.iesam.features.pets.domain;

public class Pet {
    private String id;
    private String name;
    private String descritpion;
    private String sex;
    private String dateBorn;
    private String urlImage;
    private String size;
    private String breeds;

    public Pet(String id, String name, String descritpion, String sex, String dateBorn, String urlImage, String size, String breeds) {
        this.id = id;
        this.name = name;
        this.descritpion = descritpion;
        this.sex = sex;
        this.dateBorn = dateBorn;
        this.urlImage = urlImage;
        this.size = size;
        this.breeds = breeds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }
}
