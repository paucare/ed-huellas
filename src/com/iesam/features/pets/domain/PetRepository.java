package com.iesam.features.pets.domain;


import java.util.ArrayList;
import java.util.List;

public interface PetRepository {
    ArrayList<Pet> obtainPets();
    Pet obtainPet(String petId);
    void deletePet(String petId);
    void savePet(Pet pet);
    void updatePet(Pet pet);

}
