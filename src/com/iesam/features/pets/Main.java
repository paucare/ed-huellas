package com.iesam.features.pets;

import com.iesam.features.pets.domain.Pet;
import com.iesam.features.pets.presentation.PetPresentation;

public class Main {
    public static void main(String[] args) {

       // PetPresentation.printPets();
        // PetPresentation.printPet("2");

        Pet newPet = new Pet(
                "3",
                "Dino",
                "Perro muy amigable",
                "Macho",
                "01-01-2023",
                "https://dino.png",
                "Mediano",
                "Mixto");

        PetPresentation.createPet(newPet);

        Pet petToUpdated = new Pet(
                "3",
                "Dino II",
                "Perro simpatico",
                "Macho",
                "01-01-2023",
                "https://dino.png",
                "Mediano",
                "Mixto");


        PetPresentation.updatePet(petToUpdated);





    }
}